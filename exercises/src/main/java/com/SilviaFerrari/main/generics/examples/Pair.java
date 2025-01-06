package com.SilviaFerrari.main.generics.examples;

public class Pair<K, V> {
    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }


    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Maya", 1);
        Pair<String, Integer> pair2 = new Pair<>("Lino", 2);

        System.out.println(pair1.getKey() + " " + pair1.getValue());
        System.out.println(pair2.getKey() + " " + pair2.getValue());
    }
}
