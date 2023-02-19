package com.test;

import org.apache.log4j.Logger;

import java.util.Date;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        int i;
        logger.debug("Hi its me in maven");
        logger.debug("i  :" + AdditionClass.add());
        logger.debug("Hi its me in Second time in  maven  :"+new Date());
    }
}
