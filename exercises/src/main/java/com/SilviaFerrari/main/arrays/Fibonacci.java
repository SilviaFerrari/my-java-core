package com.SilviaFerrari.main.arrays;

public class Fibonacci {
    public static long[] fibonacci(int n){
        if(n < 1){
            return new long[0];
        }

        long[] s = new long[n];

        s[0] = 0;
        if(n == 1) return s;

        s[1] = 1;
        if(n == 2) return s;

        for(int i = 2; i < n; i++){
            s[i] = s[i-2] + s[i-1];
        }
        return s;
    }
}
