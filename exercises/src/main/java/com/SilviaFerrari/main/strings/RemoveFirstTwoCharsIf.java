package com.SilviaFerrari.main.strings;
import java.lang.StringBuilder;

public class RemoveFirstTwoCharsIf {
    public static String removeFirstTwoCharsIfCharAt(String str) {
        StringBuilder res = new StringBuilder();
        if(str.charAt(0) == "H"){
            res.append("H");
        }
        if(str.charAt(1) == "e"){
            res.append("e");
        }
        for(int i = 2; i < str.length(); i++){
            res.append(str.charAt(i));
        }
        return res.toString();
    }

    public static String removeFirstTwoCharsIfStringBuilder(String str) {
        StringBuilder res = new StringBuilder(str);
        if(str.length() > 1 && str.charAt(1) != "e"){
            res.deleteCharAt(1);
        }
        if(!str.isEmpty() && str.charAt(0) != "H"){
            res.deleteCharAt(0);
        }
        return res.toString();
    }
}
