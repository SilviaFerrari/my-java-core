package com.SilviaFerrari.main.strings;

import java.lang.StringBuilder;
import java.util.Arrays;

public class DuplicateChars {
    public static char[] duplicateChars(String s) {
        java.lang.StringBuilder recurring = new java.lang.StringBuilder();
        java.lang.StringBuilder checked = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            String tmp = String.valueOf(s.charAt(i));

            if(!checked.toString().contains(tmp)){
                checked.append(tmp); // char visto per la prima volta
            }
            else if(!recurring.toString().contains(tmp)){
                recurring.append(tmp); // char già visto
            }
        }
        char[] result = recurring.toString().toCharArray();
        Arrays.sort(result);
        return result;
    }
}
