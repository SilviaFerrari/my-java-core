package com.SilviaFerrari.test.generics;

import com.SilviaFerrari.main.generics.IterableToString;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class IterableToStringTest {
    @Test
    void printIterable() {
        assertEquals("1, 2, 3, ", IterableToString.iterableToString(new ArrayList<>(List.of(1, 2, 3))));
        assertEquals("1, 2, 3, ", IterableToString.iterableToString(new LinkedList<>(List.of(1, 2, 3))));
        assertEquals("a, b, c, ", IterableToString.iterableToString(new ArrayDeque<>(List.of("a", "b", "c"))));
        assertEquals("a, b, c, ", IterableToString.iterableToString(new TreeSet<>(Set.of("b", "c", "a"))));
    }
}