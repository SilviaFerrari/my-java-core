package com.SilviaFerrari.test.strings;

import com.SilviaFerrari.main.strings.EqualIsNot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualIsNotTest {

    @Test
    void equalIsNot() {
        assertTrue(EqualIsNot.equalIsNot("is not"));
        assertFalse(EqualIsNot.equalIsNot("This is not"));
        assertTrue(EqualIsNot.equalIsNot("This is notnot"));
        assertTrue(EqualIsNot.equalIsNot("noisxxnotyynotxisi"));
        assertTrue(EqualIsNot.equalIsNot(""));
    }
}