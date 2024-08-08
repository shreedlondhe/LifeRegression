package com.qa.turtlemint.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Utils {
    public static String calculateDateToString(String format, String expiryValue) {


        LocalDateTime dateValue;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        int numOfDays = 5;


        if (expiryValue.equalsIgnoreCase("today")) {
            dateValue = LocalDateTime.now();
        } else if (expiryValue.contains("future")) {
            if (expiryValue.contains("-")) {
                numOfDays = Integer.parseInt(expiryValue.split("-")[1]);
            }

            dateValue = LocalDateTime.now().plusDays(numOfDays);

        } else if (expiryValue.contains("past")) {
            // dateValue=LocalDateTime.now().minusDays(30);
            if (expiryValue.contains("-")) {
                numOfDays = Integer.parseInt(expiryValue.split("-")[1]);
            }

            dateValue = LocalDateTime.now().minusYears(numOfDays);

        } else
            throw new RuntimeException("Enter valid choice of policy expiry");

//    	if(dateValue.format(formatter).startsWith("0"))
//    	{
//    		return dateValue.format(formatter).substring(1);
//    	}
        return dateValue.format(formatter);
    }

    public static Date calculateDate(String format, String date) {
        DateFormat formatter = new SimpleDateFormat(format);

        try {
            return formatter.parse(date);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        return null;


    }
}