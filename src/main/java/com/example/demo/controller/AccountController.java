package com.example.demo.controller;


import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by william.luo on 9/18/2017.
 */

@RestController
@RequestMapping("/api")
public class AccountController {
    AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping("/accounts/{userName}")
    public Account getAccount(@PathVariable("userName") String user){
        Account account = accountService.getAccountByUser(user);
        return account;
    }

}
