package com.SilviaFerrari.main.arrays;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end){
        if(start > end || start < 0 || start == end){
            return new String[0];
        }

        int pos;
        String[] res = new String[end-start];

        for(int i = 0; i < end-start; i++){
            pos = start + i;
            if(pos % 3 == 0 && pos % 5 == 0){
                res[i] = "FizzBuzz";
            } else if(pos % 3 == 0){
                res[i] = "Fizz";
            } else if(pos % 5 == 0){
                res[i] = "Buzz";
            } else {
                res[i] = Integer.toString(pos);
            }
        }
        return res;
    }
}
