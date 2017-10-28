package com.example.demo.controller;

import com.example.demo.dto.AccountDto;
import com.example.demo.entity.Account;
import com.example.demo.handler.exceptions.UserExistsException;
import com.example.demo.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import javax.validation.Valid;

/**
 * Created by william.luo on 9/18/2017.
 */
@Controller
public class RegistrationController {

    private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);

    @Autowired
    AccountService accountService;

    @Autowired
    private Environment env;

    @RequestMapping("/registration")
    public String startRegistration(WebRequest request, Model model) {
        logger.debug("At registration page.");
        model.addAttribute("message", env.getProperty("registration.message"));
        AccountDto accountDto = new AccountDto();
        model.addAttribute("account", accountDto);
        return "registration";
    }

    @RequestMapping(value = "/register-account", method = RequestMethod.POST)
    public String registerAccount(
            @ModelAttribute("account") @Valid AccountDto accountDto,
            BindingResult result,
            WebRequest request,
            Errors errors
    ) {
        logger.info("Trying to add account: " + accountDto);
        if (errors.hasErrors()) {
            logger.info("Did not add account: "+ accountDto);
            return "redirect:/registration";
        }
        // process request
        if(createUserAccount(accountDto,result) == null){
            logger.info("Failed to add account: " + accountDto);
            return "redirect:/registration";
        }
        logger.info("Successfully added account: " + accountDto);
        return "redirect:/profile";
    }

    private Account createUserAccount(AccountDto dto, BindingResult result){
        Account account = null;
        try{
            account = accountService.registerNewAccount(dto);
        } catch(UserExistsException e){
            logger.info(e.getLocalizedMessage());
            return null;
        }
        return account;
    }

}
