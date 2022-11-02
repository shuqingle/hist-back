package com.sugo.resident.commonapi.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DateUtils {
    private final static String FORMAT_DAY_DATE_8 = "yyyyMMdd";

    public static String showToDayLenth8(){
        SimpleDateFormat format = new SimpleDateFormat(FORMAT_DAY_DATE_8);
        return format.format(new Date());
    }
}
