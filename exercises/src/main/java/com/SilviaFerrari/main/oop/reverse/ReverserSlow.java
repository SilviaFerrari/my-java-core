package com.SilviaFerrari.main.oop.reverse;

public class ReverserSlow implements Reverser {
    @Override
    public String reverse(String input){
       char[] c = new char[input.length()];
       for(int i = input.length()-1; i >= 0; i--) {
           c[input.length()-1-i] = input.charAt(i);
       }
        return String.valueOf(c);
    }
}
