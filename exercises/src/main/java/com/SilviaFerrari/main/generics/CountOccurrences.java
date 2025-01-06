package com.SilviaFerrari.main.generics;

import java.util.Objects;

public class CountOccurrences {
    public static <T> int countOccurrencesPlain(T[] src, T item){
        int counter = 0;
        if(item == null){
            for(T t : src){
                if(t == null){
                    counter++;
                }
            }
        } else {
            for(T t : src){
                if(item.equals(t)){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static <T> int countOccurrencesObjects(T[] src, T item){
        int counter = 0;
        for(T t : src){
            if(Objects.equals(t, item)){
                counter++;
            }
        }
        return counter;
    }
}
