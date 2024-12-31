package com.SilviaFerrari.test.strings;

import com.SilviaFerrari.main.strings.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome() {
        assertFalse(Palindrome.isPalindrome("whistleblower"));
        assertTrue(Palindrome.isPalindrome("radar"));
        assertTrue(Palindrome.isPalindrome("r"));
        assertTrue(Palindrome.isPalindrome(""));
        assertTrue(Palindrome.isPalindrome("RaceCar"));
        assertFalse(Palindrome.isPalindrome("Algorithm"));
        assertTrue(Palindrome.isPalindrome("Level"));
    }
}