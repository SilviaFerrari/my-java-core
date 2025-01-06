package com.SilviaFerrari.test.functional;

import com.SilviaFerrari.main.functional.SquareFive;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SquareFiveTest {

    @Test
    void squareFive() {
        assertEquals(3, SquareFive.squareFive(List.of(3, 1, 4)));
        assertEquals(1, SquareFive.squareFive(List.of(1)));
        assertEquals(0, SquareFive.squareFive(List.of(5)));
    }
}