package com.SilviaFerrari.main.exceptions;

public class CheckLicencePlate {
    public static void checkLicencePlate(String licence){
        if(licence.length() != 7){
            throw new IllegalArgumentException("Illegal licence plate");
        }
        checkLetter(licence.substring(0,2));
        checkDigit(licence.substring(2,5));
        checkLetter(licence.substring(5,7));
    }

    public static void checkLetter(String string){
        for(char c : string.toCharArray()){
            if(!Character.isLetter(c)){
                throw new IllegalArgumentException("Not a digit: " + c);
            }
        }
    }

    public static void checkDigit(String string){
        for(char c : string.toCharArray()){
            if(!Character.isDigit(c)){
                throw new IllegalArgumentException("Not a digit: " + c);
            }
        }
    }
}
