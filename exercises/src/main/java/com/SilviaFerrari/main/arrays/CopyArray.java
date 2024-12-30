package com.SilviaFerrari.main.arrays;

public class CopyArray {
    public static double[] copyArray(double[] src){
        double[] copy = new double[src.length];
        System.arraycopy(src, 0, copy, 0, src.length);
        return copy;
    }
}
