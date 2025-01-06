package com.SilviaFerrari.main.generics;

public class Measure{
    public static <T> T max(T[] array, Measurer<T> measurer){
        T max = array[0];
        for (T t : array) {
            if(measurer.measure(max) < measurer.measure(t)){
                max = t;
            }
        }
        return max;
    }

    public static <T> T min(T[] array, Measurer<T> measurer){
        T min = array[0];
        for (T t : array) {
            if(measurer.measure(min) > measurer.measure(t)){
                min = t;
            }
        }
        return min;
    }

    public interface Measurer <T>{
        double measure(T t);
    }
}
