package com.SilviaFerrari.main.generics.examples;

import java.awt.*;
import java.util.Arrays;

public class ResizableArrayGeneric<T> {
    public static final int DEFAULT_CAPACITY = 4;
    T[] v;

    public ResizableArrayGeneric() {
        this.v = (T[])new Object[DEFAULT_CAPACITY];
    }

    public T get(int index) {
        return v[index];
    }

    public void set(int index, T value) {
        if (index >= v.length) {
            T[] tmp = (T[])new Object[index * 2];
            System.arraycopy(v, 0, tmp, 0, v.length);
            v = tmp;
        }
        v[index] = value;
    }

    public boolean contains(T value) {
        for (T i : v) {
            if (i.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void fill(T value) {
        Arrays.fill(v, value);
    }

    public T[] toArray() {
        return Arrays.copyOf(v, v.length);
    }

    public int length() {
        return v.length;
    }


    public static void main(String[] args) {
        ResizableArrayGeneric<String> resizableArrayGeneric = new ResizableArrayGeneric<>();
        resizableArrayGeneric.set(0, "Hello");
        //resizableArrayGeneric.set(1, new Point(2,3));
        // Compile-time error is much better than a run-time error!

        String s1 = (String)resizableArrayGeneric.get(0);
        //String s2 = (String)resizableArrayGeneric.get(1);
        //System.out.println(s1 + " " + s2);
    }
}
