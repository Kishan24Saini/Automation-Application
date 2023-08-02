package com.demo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeParsing {

    public static Date getStringToDate(String dateTimeString) {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date parsedDate = dateFormat.parse(dateTimeString);
            return parsedDate;
        } catch (ParseException e) {
            System.out.println("Error occurred while parsing date: " + e.getMessage());
        }
        return null;
    }
}
