package com.SilviaFerrari.exercices.arrays;

import java.util.Arrays;

public class DivideArray {
    public static double[] divideArray(double[] v, double factor){
        double[] dest = new double[v.length];
        for(int i = 0; i < v.length; i++){
            dest[i] = v[i] / factor;
        }
        return dest;
    }
    public static void main(String[] args) {
        double[] v = {1,2,3,4};
        System.out.println("Original array: " + Arrays.toString(v) + "\n" +
                "Divided array: " + Arrays.toString(divideArray(v, 2.0)));
    }
}
