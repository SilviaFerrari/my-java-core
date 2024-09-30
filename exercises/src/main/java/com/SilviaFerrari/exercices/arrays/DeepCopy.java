package com.SilviaFerrari.exercices.arrays;

import java.util.Arrays;

public class DeepCopy {
    public static int[][] deepCopy(int[][] original){
        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            copy[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return copy;
    }
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println("Array copiato: " + Arrays.deepToString(deepCopy(myNumbers)));
    }
}
