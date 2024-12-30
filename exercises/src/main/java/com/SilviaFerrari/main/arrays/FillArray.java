package com.SilviaFerrari.main.arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {

    public static double[] fillArray(int len, double value, boolean addNoise){
        double[] dest = new double[len];
        Arrays.fill(dest, value);

        if(addNoise){
            RandomGenerator random = RandomGenerator.getDefault();
            for(int i = 0; i < len; i++){
                dest[i] += random.nextDouble(-value, value) * 0.05;
            }
        }
        return dest;
    }
}
