package com.SilviaFerrari.test.arrays;

import com.SilviaFerrari.main.arrays.MoveZerosEnd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosEndTest {

    @Test
    void moveZeros() {
        assertArrayEquals(new int[]{4, 2, 0, 0}, MoveZerosEnd.moveZerosEnd(new int[]{0, 0, 4, 2}));
        assertArrayEquals(new int[]{9, 4, 0, 0}, MoveZerosEnd.moveZerosEnd(new int[]{9, 0, 0, 4}));
        assertArrayEquals(new int[]{1, 0, 0, 0}, MoveZerosEnd.moveZerosEnd(new int[]{1, 0, 0, 0}));
    }
}