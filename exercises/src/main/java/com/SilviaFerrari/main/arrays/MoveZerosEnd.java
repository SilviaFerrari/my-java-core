package com.SilviaFerrari.main.arrays;

public class MoveZerosEnd {
    public static int[] moveZerosEnd(int[] v){
        int[] output = new int[v.length]; // initialized with 0 values
        int index = 0;

        for (int j : v) {
            if (j != 0) {
                output[index++] = j;
                /*
                output[index] = j;
                index++;
                */
            }
        }
        return output;
    }
}
