package br.com.erudio;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloLog4j2 {

    static final Logger logger = LogManager.getLogger(HelloLog4j2.class);

    public boolean callMe() {
        logger.entry();
        logger.error("Inside Hello Logger!");
        return logger.exit(false);
    }
}
