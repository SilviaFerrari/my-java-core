package com.SilviaFerrari.main.warmup;

public class InterestRate {
    public static void main(String[] args) {
        int b = 1000;
        for(int i = 1; i < 4; i++){
            b += (b * 5) / 100;
            System.out.println("The balance after " + i + " year is " + b);
        }
    }
}
