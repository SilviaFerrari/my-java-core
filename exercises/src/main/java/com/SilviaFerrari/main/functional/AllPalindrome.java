package com.SilviaFerrari.main.functional;

import java.util.List;

public class AllPalindrome {
    public static boolean allPalindrome(List<String> strings){
        return strings.stream().allMatch(AllPalindrome::isPalindrome);
    }

    /* alternative version
    public static boolean allPalindrome(List<String> strings){
        return strings.stream().allMatch(s -> isPalindrome(s)).count() == string.size();
    }
     */

    public static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }
}
