package com.SilviaFerrari.exercices.arrays;

import java.util.Arrays;
import java.util.Objects;

public class SearchArray {
    public static boolean containsBruteForce(String[] strings, String searched){
        for(int i = 0; i < strings.length; i++){
            if(Objects.equals(strings[i], searched)){
                return true;
            }
        }
        return false;
    }
    public static boolean containsBinary(String[] strings, String searched){
        Arrays.sort(strings);
        return Arrays.binarySearch(strings, searched) >= 0;
    }
    public static void main(String[] args) {
        String[] v = {"car", "boat", "bike", "plane"};
        String s = "bike";
        if(containsBruteForce(v, s)){
            System.out.println("La parola si trova nell'array.");
        }
        else{
            System.out.println("La parola non si trova nell'array.");
        }
    }
}
