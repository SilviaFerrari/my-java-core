package com.SilviaFerrari.main.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {
    private static Map<Character, Integer> conversionMap() {
        HashMap<Character, Integer> conversionMap = new HashMap<>();
        conversionMap.put('I', 1);
        conversionMap.put('V', 5);
        conversionMap.put('X', 10);
        conversionMap.put('L', 50);
        conversionMap.put('C', 100);
        conversionMap.put('D', 500);
        conversionMap.put('M', 1000);

        return conversionMap;
    }
    public static int romanToDecimal(String s){
        int res = 0;
        int current;
        Map<Character, Integer> conversionMap = conversionMap();

        for(int i = 0; i < s.length(); i++){
            current = conversionMap.get(s.charAt(i));
            if(i < s.length()-1 && current < conversionMap.get(s.charAt(i+1))){
                res -= current;
            } else{
                res += current;
            }
        }
        return res;
    }
}
