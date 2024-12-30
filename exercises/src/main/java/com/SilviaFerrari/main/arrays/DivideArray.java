package com.SilviaFerrari.main.arrays;

public class DivideArray {
    public static double[] divideArray(double[] v, double factor){
        double[] dest = new double[v.length];
        for(int i = 0; i < v.length; i++){
            dest[i] = v[i] / factor;
        }
        return dest;
    }
}
