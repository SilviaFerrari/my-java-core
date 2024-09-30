package com.SilviaFerrari.exercices.arrays;

import java.util.Arrays;

public class DivideArrays {
    public static double[] divideArrays(double[] v1, double[] v2){
        if(v1.length != v2.length){
            return new double[0];
        }
        double[] res = new double[v1.length];
        for(int i = 0; i < v1.length; i++){
            res[i] = v1[i]/v2[i];
        }
        return res;
    }
    public static void main(String[] args) {
        double[] v1 = {1,1,1};
        double[] v2 = {2,4,6,3};
        System.out.println("Divided array: " + Arrays.toString(divideArrays(v1, v2)));
    }
}
