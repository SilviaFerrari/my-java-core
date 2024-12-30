package com.SilviaFerrari.main.strings;

import java.lang.StringBuilder;
import java.util.Arrays;

public class Reverse {
    public static String reverseCharAt(String string){
        StringBuilder res = new StringBuilder();
        for(int i = string.length() - 1; i >= 0; i--){
            res.append(string.charAt(i));
        }
        return res.toString();
    }

    public static String reverseStringBuilder(String string){
        // StringBuilder res = new StringBuilder(string);
        // res.reverse();
        return new StringBuilder(string).reverse().toString();
    }
}
