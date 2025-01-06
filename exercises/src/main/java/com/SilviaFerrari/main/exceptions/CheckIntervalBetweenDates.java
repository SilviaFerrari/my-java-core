package com.SilviaFerrari.main.exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end){
        LocalDate beginDate = LocalDate.parse(begin);
        LocalDate endDate = LocalDate.parse(end);
        return beginDate.isBefore(endDate);
    }
}
