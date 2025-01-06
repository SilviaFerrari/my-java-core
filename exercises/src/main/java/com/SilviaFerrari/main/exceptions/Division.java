package com.SilviaFerrari.main.exceptions;

public class Division {
    public static double division(double a, double b){
        if(b == 0) {
            throw new IllegalArgumentException("Error: Division by zero");
        }
        return a / b;
    }
}
