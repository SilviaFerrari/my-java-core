package com.SilviaFerrari.main.strings;

public class SumDigits {
    public static int sumDigits(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)){
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }
}
