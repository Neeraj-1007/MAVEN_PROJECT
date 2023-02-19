package com.test.helper;


public class LoggerHelper {

    private static LoggerHelper LOGGER_INSTANCE = null;

    private LoggerHelper(){}

    public LoggerHelper getInstance(String t){
        if(LOGGER_INSTANCE==null){
            return new LoggerHelper();
        }else {
            return null;
        }
    }


}
