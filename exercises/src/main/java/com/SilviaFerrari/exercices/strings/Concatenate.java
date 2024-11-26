package com.SilviaFerrari.exercices.strings;

public class Concatenate {
    public static String concatenate(String[] strings) {
        StringBuilder result = new StringBuilder();
        for(String s : strings){
            result.append(s);
        }
    return result.toString();
    }
}
