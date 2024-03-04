package com.f20an.vulnerable_app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args)
    {
        logger.info("F20AN Vulnerable Application");

        // Run HTTP Server
        SpringApplication.run(App.class, args);
    }
}
