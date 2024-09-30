package com.SilviaFerrari.exercices.arrays;

import java.util.Arrays;

public class Fibonacci {
    public static long[] serieFibonacci(int n){
        if(n < 1){
            return new long[0];
        }
        long[] s = new long[n];
        s[0] = 1;
        s[1] = 1;
        for(int i = 2; i < n; i++){
            s[i] = s[i-2] + s[i-1];
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("La serie di Fibonacci è: " + Arrays.toString(serieFibonacci(10)));
    }
}
