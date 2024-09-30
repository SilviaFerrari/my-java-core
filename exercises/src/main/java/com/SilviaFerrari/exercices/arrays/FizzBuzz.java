package com.SilviaFerrari.exercices.arrays;

import java.util.Arrays;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end){
        if(start > end || start < 0){
            return new String[0];
        }
        String[] res = new String[end-1];
        for(int i = 1; i < end; i++){
            if(i%3 == 0 && i%5 == 0){
                res[i-1] = "FizzBuzz";
            }
            else if(i%3 == 0){
                res[i-1] = "Fizz";
            }
            else if(i%5 == 0){
                res[i-1] = "Buzz";
            }
            else{
                res[i-1] = Integer.toString(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Il vettore risultante e': " + Arrays.toString(fizzBuzz(1,16)));
    }
}
