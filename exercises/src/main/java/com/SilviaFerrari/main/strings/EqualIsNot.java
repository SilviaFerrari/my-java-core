package com.SilviaFerrari.main.strings;

public class EqualIsNot {
    public static boolean equalIsNot(String s) {
        if(s == null || s.isEmpty()){
            return true;
        }
        int indexIs = s.indexOf("is");
        int indexNot = s.indexOf("not");

        while(indexIs != -1 && indexNot != -1){
            indexIs = s.indexOf("is", indexIs+2);
            indexNot = s.indexOf("not", indexNot+3);
        }

        return indexIs == indexNot;
    }
}
