package com.SilviaFerrari.test.arrays;

import com.SilviaFerrari.main.arrays.DeepCopy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeepCopyTest {

    @Test
    void deepCopy() {
        // short version
        assertArrayEquals(new int[][] {{1, 2, 3, 4}, {5, 6, 7}}, DeepCopy.deepCopy(new int[][]{{1, 2, 3, 4}, {5, 6, 7}}));
        assertArrayEquals(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, DeepCopy.deepCopy(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));

        //long version
        int[][] matrix1 = {{1, 2, 3, 4}, {5, 6, 7}};
        int[][] deepCopy1 = DeepCopy.deepCopy(matrix1);
        // asserts that two objects do not refer to the same object
        assertNotSame(deepCopy1[0], matrix1[0]);
        assertNotSame(deepCopy1[1], matrix1[1]);

        int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7}, {7, 8, 9}};
        int[][] deepCopy2 = DeepCopy.deepCopy(matrix2);
        // asserts that two objects do not refer to the same object
        assertNotSame(deepCopy2[0], matrix2[0]);
        assertNotSame(deepCopy2[1], matrix2[1]);
        assertNotSame(deepCopy2[2], matrix2[2]);
    }
}