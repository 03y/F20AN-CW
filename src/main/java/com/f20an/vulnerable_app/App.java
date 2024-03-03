package com.f20an.vulnerable_app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args)
    {
        System.out.println("hello world");
        
        logger.trace("hello world from log4j");
        logger.info("hello world from log4j");
        logger.debug("hello world from log4j");
        logger.warn("hello world from log4j");
        logger.error("hello world from log4j");
    }
}
