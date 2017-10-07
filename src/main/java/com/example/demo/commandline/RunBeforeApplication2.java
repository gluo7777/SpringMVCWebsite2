package com.example.demo.commandline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class RunBeforeApplication2 implements ApplicationRunner{
    private static final Logger logger = LoggerFactory.getLogger(RunBeforeApplication2.class);
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        logger.info("This thing is running with the options: " + applicationArguments.getOptionNames());
    }
}
