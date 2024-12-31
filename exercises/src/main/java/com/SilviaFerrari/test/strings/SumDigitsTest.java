package com.SilviaFerrari.test.strings;

import com.SilviaFerrari.main.strings.SumDigits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDigitsTest {

    @Test
    void sumDigits() {
        assertEquals(4, SumDigits.sumDigits("ab2ncj 1bj1"));
        assertEquals(6, SumDigits.sumDigits("aa1bc2d3"));
        assertEquals(8, SumDigits.sumDigits("aa11b33"));
        assertEquals(0, SumDigits.sumDigits("Chocolate"));
    }
}