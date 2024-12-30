package com.SilviaFerrari.test.arrays;

import com.SilviaFerrari.main.arrays.CopyArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyArrayTest {

    @Test
    void copyArray() {
        assertArrayEquals(new double[]{1,2,3}, CopyArray.copyArray(new double[]{1,2,3}));
        assertArrayEquals(new double[]{4, 5, 78, 3, 7, 45, 56}, CopyArray.copyArray(new double[]{4, 5, 78, 3, 7, 45, 56}));
    }
}