package com.SilviaFerrari.test.collections.maps;

import com.SilviaFerrari.main.collections.maps.RomanToDecimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToDecimalTest {
    @Test
    void romanToDecimal() {
        assertEquals(3, RomanToDecimal.romanToDecimal("III"));
        assertEquals(58, RomanToDecimal.romanToDecimal("LVIII"));
        assertEquals(1994, RomanToDecimal.romanToDecimal("MCMXCIV"));
        assertEquals(3999, RomanToDecimal.romanToDecimal("MMMCMXCIX"));
        assertEquals(444, RomanToDecimal.romanToDecimal("CDXLIV"));
        assertEquals(3888, RomanToDecimal.romanToDecimal("MMMDCCCLXXXVIII"));
    }

}