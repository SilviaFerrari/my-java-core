package com.SilviaFerrari.main.strings;

import java.lang.StringBuilder;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }
}
