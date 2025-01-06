package com.SilviaFerrari.main.exceptions;

import java.text.ParseException;

public class CheckString {
    public static void checkString(String s) throws ParseException {
        if (s.length() < 2 || s.length() % 2 != 0) {
            throw new ParseException(s, 0);
        }
        boolean expectedLetter = true;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) && expectedLetter) {
                throw new ParseException(s, i);
            }
            if (Character.isLetter(s.charAt(i)) && !expectedLetter) {
                throw new ParseException(s, i);
            }
            expectedLetter = !expectedLetter;
        }
    }
}
