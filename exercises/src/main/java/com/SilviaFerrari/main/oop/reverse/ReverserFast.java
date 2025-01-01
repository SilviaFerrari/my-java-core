package com.SilviaFerrari.main.oop.reverse;

public class ReverserFast implements Reverser {
    @Override
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
