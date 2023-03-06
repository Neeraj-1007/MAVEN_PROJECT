package com.test;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        String i;
//        logger.debug("Hi its me in maven");
//        logger.debug("i  :" + AdditionClass.add());
//        logger.debug("Hi its me in Second time in  maven  :"+new Date());


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        i = getIValueFromList(list);
        logger.debug(i);

        List<Integer> b = list.stream().filter(n -> n.equals(2)).collect(Collectors.toList());
        Integer c = b.get(0);

        logger.debug(c);


        int d = 9;
        if (d <= 15) {
            d = getIfCondition(d);
            logger.debug(d + 1);
        } else if (d > 15 || d < 20) {
            getElseIfCondition(d);
        } else {
            d = getElseCondition(d);
            logger.debug(d);
        }

    }


    public static int getIfCondition(int d) {
        switch (d) {
            case 1:
                logger.debug(d);
                return d;
            case 2:
                logger.debug(d);
                return d + 1;
            case 3:
                logger.debug(d);
                return d + 2;
            case 4:
                logger.debug(d);
                return d + 3;
            case 5:
                logger.debug(d);
                return d + 4;
            default:
                logger.debug(d);
                return d + 5;
        }
    }

    public static int getElseIfCondition(int d) {


        if (d <= 16) {

            return d + 2;
        } else if (d == 17) {
            return d + 2;
        } else if (d == 18) {
            return d + 2;
        } else {
            return d + 2;
        }

    }


    public static int getElseCondition(int d) {

        if (d > 20) {
            return d;
        } else if (d == 21) {
            return d;
        } else if (d == 22) {
            return d;
        } else if (d > 23 || d < 25) {
            return d;
        } else {
            return d;
        }

    }


    public static String getIValueFromList(List<Integer> list) {
        String i = null;
        for (Integer a : list) {
            if (a.equals(2)) {
                i = String.valueOf(a);
                logger.debug(i);
            }
        }
        return i;
    }

}
