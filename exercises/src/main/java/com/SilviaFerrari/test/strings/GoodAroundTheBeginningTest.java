package com.SilviaFerrari.test.strings;

import com.SilviaFerrari.main.strings.GoodAroundTheBeginning;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAroundTheBeginningTest {

    @Test
    void goodAroundTheBeginning() {
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning("good Sweet"));
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning(" good Sweet"));
        assertFalse(GoodAroundTheBeginning.goodAroundTheBeginning("goo"));
    }
}