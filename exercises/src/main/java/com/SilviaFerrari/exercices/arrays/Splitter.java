package com.SilviaFerrari.exercices.arrays;

public class Splitter {
    public static int[] splitter(int input){
        String str = Integer.toString(input);
        int[] digit = new int[str.length()];

        for(int i = 0; i < str.length(); i++){
            digit[i] = Character.getNumericValue(str.charAt(i));
        }
        return digit;
    }
    public static void main(String[] args) {

    }
}
