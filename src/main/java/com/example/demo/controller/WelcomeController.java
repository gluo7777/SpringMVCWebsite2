package com.example.demo.controller;

import com.example.demo.config.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by william.luo on 9/18/2017.
 */
@Controller
public class WelcomeController {

    private ConfigurationService configurationService;

    @Autowired
    public WelcomeController(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

    @RequestMapping("/")
    public String welcome(Map<String, Object> model){
        model.put("message", configurationService.getWelcomeMessage());
        return "welcome";
    }
}
