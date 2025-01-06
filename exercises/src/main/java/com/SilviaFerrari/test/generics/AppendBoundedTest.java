package com.SilviaFerrari.test.generics;

import com.SilviaFerrari.main.generics.AppendBounded;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppendBoundedTest {

    @Test
    void append1() {
        List<Number> a = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> b = new ArrayList<>(List.of(4, 5));
        AppendBounded.append1(a, b);
        assertEquals(List.of(1, 2, 3, 4, 5), a);
    }

    @Test
    void append2() {
        List<Number> a = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> b = new ArrayList<>(List.of(4, 5));
        AppendBounded.append2(a, b);
        assertEquals(List.of(1, 2, 3, 4, 5), a);
    }
}