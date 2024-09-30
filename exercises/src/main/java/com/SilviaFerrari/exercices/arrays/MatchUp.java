package com.SilviaFerrari.exercices.arrays;

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
    public static void main(String[] args) {
        int[] v1 = {1,2,3};
        int[] v2 = {2,3,10};
        System.out.printf("Riultato: %d.", matchUp(v1, v2));
    }
}
