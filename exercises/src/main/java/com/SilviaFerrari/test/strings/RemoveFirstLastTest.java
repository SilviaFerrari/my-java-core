package com.SilviaFerrari.test.strings;

import com.SilviaFerrari.main.strings.RemoveFirstLast;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstLastTest {

    @Test
    void removeFirstLast() {
        assertEquals("Google", RemoveFirstLast.removeFirstLast("Google"));
        assertEquals("oogl", RemoveFirstLast.removeFirstLast("eoogle"));
        assertEquals("", RemoveFirstLast.removeFirstLast("FF"));
        assertEquals("F", RemoveFirstLast.removeFirstLast("F"));
    }
}