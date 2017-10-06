package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by william.luo on 9/18/2017.
 */
@Controller
public class RegistrationController {

    @Autowired
    private Environment env;

    public RegistrationController() {
    }

    @RequestMapping("/registration")
    public String startRegistration(Map<String,Object> model){
        model.put("message",env.getProperty("registration.message"));
        return "registration";
    }

}
