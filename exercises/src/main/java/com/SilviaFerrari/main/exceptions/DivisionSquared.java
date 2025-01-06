package com.SilviaFerrari.main.exceptions;

public class DivisionSquared {
    public static int divisionSquared(int a, int b){
        try{
            return (a / b) * (a / b);
        } catch (Exception e) {
            return 0;
        }
    }
}
