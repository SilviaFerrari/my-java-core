package com.SilviaFerrari.main.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars {
    public static Set<Character> recurringChars(String string){
        Set<Character> recurrent = new HashSet<>();
        Set<Character> checked = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            if(checked.contains(string.charAt(i))){
                recurrent.add(string.charAt(i));
            } else{
                checked.add(string.charAt(i));
            }
        }
        return recurrent;
    }
}
