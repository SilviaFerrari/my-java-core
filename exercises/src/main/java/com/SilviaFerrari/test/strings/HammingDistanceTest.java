package com.SilviaFerrari.test.strings;

import com.SilviaFerrari.main.strings.HammingDistance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HammingDistanceTest {

    @Test
    void hammingDistance() {
        assertEquals(1, HammingDistance.hammingDistance("nicola", "n1cola"));
        assertEquals(6, HammingDistance.hammingDistance("nicola", "zzzzzz"));
        assertEquals(0, HammingDistance.hammingDistance("nicola", "nicola"));
        assertEquals(-1, HammingDistance.hammingDistance("nicola", "nicol"));
    }
}