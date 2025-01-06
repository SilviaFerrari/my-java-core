package com.SilviaFerrari.main.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MorseCode {
    private static Map<Character, String> conversionMap() {
        HashMap<Character, String> conversionMap = new HashMap<>();
        conversionMap.put('a', "._");
        conversionMap.put('b', "_...");
        conversionMap.put('c', "_._.");
        conversionMap.put('d', "_..");
        conversionMap.put('e', ".");
        conversionMap.put('f', ".._.");
        conversionMap.put('g', "__.");
        conversionMap.put('h', "....");
        conversionMap.put('i', "..");
        conversionMap.put('j', ".___");
        conversionMap.put('k', "_._");
        conversionMap.put('l', "._..");
        conversionMap.put('m', "__");
        conversionMap.put('n', "_.");
        conversionMap.put('o', "___");
        conversionMap.put('p', ".__.");
        conversionMap.put('q', "__._");
        conversionMap.put('r', "._.");
        conversionMap.put('s', "...");
        conversionMap.put('t', "_");
        conversionMap.put('u', ".._");
        conversionMap.put('v', "..._");
        conversionMap.put('w', ".__");
        conversionMap.put('x', "_.._");
        conversionMap.put('y', "_.__");
        conversionMap.put('z', "__..");
        conversionMap.put('1', ".____");
        conversionMap.put('2', "..___");
        conversionMap.put('3', "...__");
        conversionMap.put('4', "...._");
        conversionMap.put('5', ".....");
        conversionMap.put('6', "_....");
        conversionMap.put('7', "__...");
        conversionMap.put('8', "___..");
        conversionMap.put('9', "____.");
        conversionMap.put('0', "_____");

        return conversionMap;
    }

    public static String morseCode(String string){
        StringBuilder morse = new StringBuilder();
        Map<Character, String> conversionMap = conversionMap();

        for(char c : string.toLowerCase().toCharArray()){
            if(Objects.isNull(conversionMap.get(c))){
                throw new IllegalArgumentException("Unsupported char: " + c);
            }
            morse.append(conversionMap.get(c)).append(" ");
        }
        return morse.toString().trim();
    }
}