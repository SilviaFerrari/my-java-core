package com.SilviaFerrari.test.exceptions;

import com.SilviaFerrari.main.exceptions.ReadLineNoDelegation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadLineNoDelegationTest {
    @Test
    void noDelegation() {
        assertNull(ReadLineNoDelegation.readLineNoDelegation("src/main/resources/missing-file.txt"));
        assertEquals("aahing", ReadLineNoDelegation.readLineNoDelegation("exercises/src/main/java/com/SilviaFerrari/resources/file1.txt"));
    }
}