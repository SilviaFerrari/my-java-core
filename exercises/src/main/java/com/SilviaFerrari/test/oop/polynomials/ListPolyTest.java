package com.SilviaFerrari.test.oop.polynomials;

import com.SilviaFerrari.main.oop.polynomials.ListPoly;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ListPolyTest extends PolyTestBase{
    @BeforeEach
    void setUp() {
        p = new ListPoly(new double[]{1, 2, 3, 4});
    }
}