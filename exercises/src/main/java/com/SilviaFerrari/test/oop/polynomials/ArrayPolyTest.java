package com.SilviaFerrari.test.oop.polynomials;

import com.SilviaFerrari.main.oop.polynomials.ArrayPoly;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPolyTest extends PolyTestBase{
    @BeforeEach
    void setUp() {
        p = new ArrayPoly(new double[]{1, 2, 3, 4});
    }
}