package com.qa.turtlemint.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class LogUtils {


    private static final Logger logger = LoggerFactory.getLogger(LogUtils.class);


    private static String getPrettyMessage(String message) {
        return " AUTOMATION_LOG: ==> " + message;
    }

    public static void debug(String message) {
        logger.debug(getPrettyMessage(message));
        //sysout(message);
    }

    private static void sysout(String message) {
        System.out.println(getPrettyMessage(message));
    }

    public static void info(String message) {
        logger.info(getPrettyMessage(message));
        //sysout(message);
    }

    public static void error(String message) {
        logger.error(getPrettyMessage(message));
        //sysout(message);
    }

    public static void error(String message, Exception e) {
        logger.error(getPrettyMessage(message), e);
        //sysout(message);
    }

    public static void warn(String message) {
        logger.warn(getPrettyMessage(message));
        //sysout(message);
    }

}
