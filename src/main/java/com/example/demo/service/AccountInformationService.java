package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountInformationService {

    @Autowired
    AccountService accountService;

    public AccountInformationService() {
    }

    public String getUserNameForAccount(long accountId){
        return "";
    }

    public String getAccountInformation(){
        return "Account information and stuff";
    }
}
