package com.SilviaFerrari.main.strings;

public class HammingDistance {
    public static int hammingDistance(String s1, String s2) {
        if(s1.length() == s2.length()) {
            int distance = 0;
            for(int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i) != s2.charAt(i)) {
                    distance++;
                }
            }
            return distance;
        }
        return -1;
    }
}