package com.SilviaFerrari.test.arrays;

import com.SilviaFerrari.main.arrays.Splitter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitterTest {

    @Test
    void splitter() {
        assertArrayEquals(new int[]{2, 3, 4, 4, 5, 6}, Splitter.splitter(234456));
        assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4}, Splitter.splitter(987654));
    }
}