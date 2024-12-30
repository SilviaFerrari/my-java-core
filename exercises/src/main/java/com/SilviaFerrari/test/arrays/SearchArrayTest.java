package com.SilviaFerrari.test.arrays;

import com.SilviaFerrari.main.arrays.SearchArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchArrayTest {
    final String[] words = {"car", "boat", "bike", "plane"};

    @Test
    void containsBruteForce() {
        assertTrue(SearchArray.containsBruteForce(words, "bike"));
        assertFalse(SearchArray.containsBruteForce(words, "helicopter"));
    }

    @Test
    void containsBinary() {
        assertTrue(SearchArray.containsBinary(words, "bike"));
        assertFalse(SearchArray.containsBinary(words, "helicopter"));
    }
}