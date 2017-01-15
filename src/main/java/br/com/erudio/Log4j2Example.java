package br.com.erudio;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Example {

    static final Logger logger = LogManager.getLogger(Log4j2Example.class);

    public static void main(String[] args) {

        logger.trace("Entering Log4j Example.");
        HelloLog4j2 hello = new HelloLog4j2();
        if (!hello.callMe()) logger.error("Ohh!Failed!");
        logger.trace("Exiting Log4j Example.");
    }
}