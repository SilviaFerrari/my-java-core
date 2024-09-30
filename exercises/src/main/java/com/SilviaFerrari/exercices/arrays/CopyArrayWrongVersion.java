package com.SilviaFerrari.exercices.arrays;

import java.util.Arrays;
import java.util.Scanner;
public class CopyArrayWrongVersion {
    public static Scanner scan = new Scanner(System.in);
    public static void arrayGenerator(double[] arr){
        int index = 0;
        while(index < arr.length){
            System.out.println("Please, enter a number:");
            arr[index] = scan.nextDouble();
            index++;
        }
    }
    public static void main(String[] args) {
        System.out.println("Please, enter the array's length:");
        int len = scan.nextInt();

        double[] arr = new double[len];
        arrayGenerator(arr);
        double[] arr2 = Arrays.copyOf(arr, len);

        System.out.println("Array 1: " + Arrays.toString(arr));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
}
