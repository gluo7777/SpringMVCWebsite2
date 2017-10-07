package com.example.demo.controller;
import com.example.demo.dto.AccountDto;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * Created by william.luo on 9/18/2017.
 */
@Controller
public class RegistrationController {

    @Autowired
    AccountService accountService;

    @Autowired
    private Environment env;

    public RegistrationController() {
    }

    @RequestMapping("/registration")
    public String startRegistration(WebRequest request, Model model){
        model.addAttribute("message",env.getProperty("registration.message"));
        AccountDto accountDto = new AccountDto();
        model.addAttribute("account",accountDto);
        return "registration";
    }

    @RequestMapping("/register-account")
    public String registerAccount(){

        return "";
    }

}
