package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by william.luo on 9/18/2017.
 */
@Service
public class ConfigurationService {

    private String welcomeMessage = "Welcome!";
    private String registrationMessage = "Welcome!";

    public ConfigurationService() {
    }

    @Value("${welcome.message}")
    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    @Value("${registration.message}")
    public void setRegistrationMessage(String registrationMessage) {
        this.registrationMessage = registrationMessage;
    }

    public String getRegistrationMessage() {
        return registrationMessage;
    }


}
