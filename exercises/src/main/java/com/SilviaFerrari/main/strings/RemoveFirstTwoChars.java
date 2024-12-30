package com.SilviaFerrari.main.strings;

import java.lang.StringBuilder;

public class RemoveFirstTwoChars {
    public static String removeFirstTwoCharsCharAt(String string) {
        StringBuilder res = new StringBuilder();
        for(int i = 2; i < string.length(); i++) {
            res.append(string.charAt(i));
        }
        return res.toString();
    }

    public static String removeFirstTwoCharsStringBuilder(String string) {
        // StringBuilder res = new StringBuilder(str);
        // res.delete(0, 1);
        return new StringBuilder(string).delete(0, 2).toString();
    }
}
