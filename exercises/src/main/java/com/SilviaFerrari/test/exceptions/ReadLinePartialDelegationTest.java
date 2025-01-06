package com.SilviaFerrari.test.exceptions;

import com.SilviaFerrari.main.exceptions.ReadLinePartialDelegation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadLinePartialDelegationTest {
    @Test
    void readLinePartialDelegationTest() {
        assertThrows(RuntimeException.class, () -> ReadLinePartialDelegation.readLinePartialDelegation("src/main/resources/missing-file.txt"));
        assertEquals("aahing", ReadLinePartialDelegation.readLinePartialDelegation("exercises/src/main/java/com/SilviaFerrari/resources/file1.txt"));
    }
}