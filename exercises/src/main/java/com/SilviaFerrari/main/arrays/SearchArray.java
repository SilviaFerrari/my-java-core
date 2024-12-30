package com.SilviaFerrari.main.arrays;

import java.util.Arrays;
import java.util.Objects;

public class SearchArray {
    public static boolean containsBruteForce(String[] strings, String searched){
        for (String string : strings) {
            // Objects.equals(string, searched)
            if (string.equals(searched)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsBinary(String[] strings, String searched){
        String[] copy = Arrays.copyOf(strings, strings.length);
        Arrays.sort(copy);
        return Arrays.binarySearch(copy, searched) >= 0;
    }
}
