package com.example.demo.controller;

import com.example.demo.service.AccountInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ProfileController {
    @Autowired
    AccountInformationService accountInformationService;

    public ProfileController() {
    }

    @RequestMapping("/profile")
    public String getAccountInfo(Map<String, Object> model){
        model.put("message",accountInformationService.getAccountInformation());
        return "profile";
    }
}
