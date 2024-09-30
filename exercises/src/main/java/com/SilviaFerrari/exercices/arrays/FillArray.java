package com.SilviaFerrari.exercices.arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {
    public static RandomGenerator rgen = RandomGenerator.getDefault();

    public static double[] fillArray(int len, double value, boolean addNoise){
        double[] dest = new double[len];
        Arrays.fill(dest, value);

        if(addNoise){
            int index = 0;
            for(int i = 0; i < len; i++){
                dest[i] += rgen.nextDouble(-value, value) * 0.05;
            }
        }
        return dest;
    }
    public static void main(String[] args) {
        int len = rgen.nextInt(10);
        double value = rgen.nextDouble(10.1);
        boolean addNoise = rgen.nextBoolean();

        double[] array = fillArray(len, value, addNoise);
        System.out.printf("The array has to be %d long, with a value of %f with noise %b.\n", len, value, addNoise);
        System.out.println(Arrays.toString(array));
    }
}
