package com.SilviaFerrari.main.generics;

public class IterableToString {
    public static <E> String iterableToString(Iterable<E> src){
        StringBuilder sb = new StringBuilder();
        for(E e : src){
            sb.append(e.toString()).append(", ");
        }
        return sb.toString();
    }
}
