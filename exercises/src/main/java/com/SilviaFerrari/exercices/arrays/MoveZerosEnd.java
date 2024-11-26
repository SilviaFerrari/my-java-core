package com.SilviaFerrari.exercices.arrays;

import java.util.Arrays;

public class MoveZerosEnd {
    public static int[] moveZeros(int[] v){
        int[] output = new int[v.length];
        int index = 0;
        for(int i = 0; i < v.length; i++){
            if(v[i] != 0){
                output[index] = v[i];
                index++;
            }
        }
        Arrays.fill(output, index, v.length-1, 0);
        return output;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,4,0,5,0,3};
        System.out.println("Original array: " + Arrays.toString(arr) + "\n" +
                "Ordered original array: " + Arrays.toString(moveZeros(arr)) + "\n");

    }
}
