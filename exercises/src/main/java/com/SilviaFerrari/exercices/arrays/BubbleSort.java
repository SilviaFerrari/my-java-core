package com.SilviaFerrari.exercices.arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void swap(int[] v, int i){
        int tmp = v[i];
        v[i] = v[i+1];
        v[i+1] = tmp;
    }
    public static void bubbleSort(int[] v){
        boolean changed = true;
        while(changed){
            changed = false;
            for(int i = 0; i < (v.length - 1); i++){
                if(v[i] > v[i+1]){
                    swap(v, i);
                    changed = true;
                }
            }
        }
    }
    public static int[] bubbleSortCopy(int[] v){
        int[] sorted = Arrays.copyOf(v, v.length);
        bubbleSort(sorted);
        return sorted;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println("Original array: " + Arrays.toString(arr) + "\n");
        bubbleSort(arr);
        System.out.println("Ordered original array: " + Arrays.toString(arr) + "\n" +
                "Ordered copied array: " + Arrays.toString(bubbleSortCopy(arr)));
    }
}
