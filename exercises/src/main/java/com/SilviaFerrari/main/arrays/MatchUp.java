package com.SilviaFerrari.main.arrays;

public class MatchUp {
    public static int matchUp(int[] v1, int[] v2){
        int counter = 0;
        for(int i = 0; i < v1.length; i++){
            if(v1[i] != v2[i] && Math.abs(v1[i] - v2[i]) <= 2){
                counter++;
            }
        }
        return counter;
    }
}
