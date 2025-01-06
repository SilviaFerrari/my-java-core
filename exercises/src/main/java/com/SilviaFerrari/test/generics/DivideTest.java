package com.SilviaFerrari.test.generics;

import com.SilviaFerrari.main.generics.Divide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {
    private static final double DELTA = 1e-09;

    @Test
    void divide() {
        assertEquals(2.0, Divide.divide(4, 2), DELTA);
        assertEquals(2.0, Divide.divide(4.0, 2.0), DELTA);
        assertEquals(2.0, Divide.divide(4, 2.0), DELTA);
        assertEquals(2.0, Divide.divide(4.0, 2), DELTA);
        assertEquals(Double.POSITIVE_INFINITY, Divide.divide(1.0,0.0));
    }
}