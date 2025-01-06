package com.SilviaFerrari.main.generics.examples;

class GenericType<T> {

    //A field of "some type"
    private T t;

    // Takes a value of "some type" and assigns it to the field
    public GenericType(T t) {
        this.t = t;
    }

    // Returns a value of "some type"
    public T get() {
        return t;
    }

    // Takes a value of "some type" and assigns it to a field
    public void set(T t) {
        this.t = t;
    }


    public static void main(String[] args) {
        GenericType<Integer> obj1 = new GenericType<>(10);

        GenericType<String> obj2 = new GenericType<>("abc");

        System.out.println(obj1.get() + " " + obj2.get());
    }
}
