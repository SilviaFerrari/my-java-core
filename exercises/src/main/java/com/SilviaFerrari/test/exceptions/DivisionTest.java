package com.SilviaFerrari.test.exceptions;

import com.SilviaFerrari.main.exceptions.Division;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    @Test
    void divisionTest() {
        assertThrows(IllegalArgumentException.class, () -> Division.division(-1, 0));
        assertThrows(IllegalArgumentException.class, () -> Division.division(1, 0));
        assertEquals(2.0, Division.division(4.0, 2.0), 0.001);
        assertEquals(-2.0, Division.division(-8.0, 4.0), 0.001);
    }
}