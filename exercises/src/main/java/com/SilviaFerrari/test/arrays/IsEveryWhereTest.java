package com.SilviaFerrari.test.arrays;

import com.SilviaFerrari.main.arrays.IsEveryWhere;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsEveryWhereTest {

    @Test
    void isEveryWhere() {
        assertTrue(IsEveryWhere.isEveryWhere(new int[]{1, 2, 1, 3}, 1));
        assertFalse(IsEveryWhere.isEveryWhere(new int[]{1, 2, 1, 3}, 2));
        assertFalse(IsEveryWhere.isEveryWhere(new int[]{1, 2, 1, 3, 4}, 1));
    }
}