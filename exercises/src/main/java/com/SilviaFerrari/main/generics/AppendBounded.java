package com.SilviaFerrari.main.generics;

import com.SilviaFerrari.main.oop.phonebook.Person;

import java.util.List;

public class AppendBounded {
    public static <T, U extends T> void append1(List<T> dst, List<U> src){
        dst.addAll(src);
    }

    // versione alternativa
    public static <T> void append2(List<T> dst, List<? extends T> src){
        dst.addAll(src);
    }
}
