package com.SilviaFerrari.main.generics.examples;

import java.util.Arrays;

public class ResizableArrayObject {
    public static final int DEFAULT_CAPACITY = 4;
    Object[] v;

    public ResizableArrayObject() {
        this.v = new Object[DEFAULT_CAPACITY];
    }

    public Object get(int index) {
        return v[index];
    }

    public void set(int index, Object value) {
        if (index >= v.length) {
            Object[] tmp = new Object[index * 2];
            System.arraycopy(v, 0, tmp, 0, v.length);
            v = tmp;
        }
        v[index] = value;
    }

    public boolean contains(Object value) {
        for (Object i : v) {
            if (i.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void fill(Object value) {
        Arrays.fill(v, value);
    }

    public Object[] toArray() {
        return Arrays.copyOf(v, v.length);
    }

    public int length() {
        return v.length;
    }


    public static void main(String[] args) {
        ResizableArrayObject resizableArrayObject = new ResizableArrayObject();
        resizableArrayObject.set(0, "Hello");
        resizableArrayObject.set(1, "World");
        // here we could have a potential run-time error! BAD.

        String s1 = (String) resizableArrayObject.get(0);
        String s2 = (String) resizableArrayObject.get(1);
        System.out.println(s1+ " " +s2);
    }
}
