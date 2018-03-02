package com.aopAndLog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationSource;

public class Log4jService {
//	private static final Logger logger = LogManager.getLogger("HelloWorld");
    public static void main(String[] args) {
    	Logger logger = null;
    	
    	ConfigurationSource  source;
//    	logger = LogManager.getLogger("com.aopAndLog.Log4jService");
    	logger = LogManager.getLogger(Log4jService.class.getName());
//    	logger.trace("trace"); 
//        logger.debug("debug"); 
//        logger.info("Info"); 
//        logger.warn("warn"); 
//        logger.error("error"); 
//        logger.fatal("fatal");

    	logger.info("info");
    	logger.debug("Logging in user {} with birthday {} ", "username", "ddday");
    	logger.debug("Logging in user %s with birthday %s ", "aaa","bbb");
    }
}
