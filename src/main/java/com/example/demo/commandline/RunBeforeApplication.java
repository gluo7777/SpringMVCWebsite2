package com.example.demo.commandline;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

/**
 * Runs before application runs
 * Passes arguments in as a string
 */
@Component
public class RunBeforeApplication implements CommandLineRunner{
    private static final Logger logger = LoggerFactory.getLogger(RunBeforeApplication.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("CommandLineRunner: This thing is running with the arguments: " + args);
    }

}
