package com.SilviaFerrari.test.collections.maps;

import com.SilviaFerrari.main.collections.maps.ValuesKeys;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ValuesKeysTest {
    @Test
    void valuesKeys() {
        assertFalse(ValuesKeys.valuesKeys(Map.of("a", "1", "b", "2", "c", "3")));
        assertTrue(ValuesKeys.valuesKeys(Map.of("a", "1", "b", "2", "c", "a")));
    }
}