package com.SilviaFerrari.main.generics;

public class BinarySearch {
    public static <T extends Comparable<T>> int find(T[] array, T key){
        int low = 0, high = array.length - 1, mid;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(key.compareTo(array[mid]) == 0){
                return mid;
            }
            else if(key.compareTo(array[mid]) > 0){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
