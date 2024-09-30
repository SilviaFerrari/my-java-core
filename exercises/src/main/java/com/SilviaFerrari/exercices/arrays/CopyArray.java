package com.SilviaFerrari.exercices.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    public static Scanner scan = new Scanner(System.in);
    public static void arrayGenerator(double[] arr){
        int index = 0;
        while(index < arr.length){
            System.out.println("Please, enter a number:");
            arr[index] = scan.nextDouble();
            index++;
        }
    }

    public static double[] copyArray(double[] arr){
        double[] copiedArr = new double[arr.length];
        System.arraycopy(arr, 0, copiedArr, 0, arr.length);
        return copiedArr;
    }
    public static void main(String[] args) {
        System.out.println("Please, enter the array's length:");
        int len = scan.nextInt();

        double[] arr = new double[len];
        arrayGenerator(arr);
        double[] copiedArr = copyArray(arr);

        System.out.println("Array 1: " + Arrays.toString(arr));
        System.out.println("Copied array 2: " + Arrays.toString(copiedArr));
    }
}
