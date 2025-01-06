package com.SilviaFerrari.test.exceptions;

import com.SilviaFerrari.main.exceptions.ReadLineCompleteDelegation;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReadLineCompleteDelegationTest {
    @Test
    void readLineCompleteDelegationTest() throws IOException {
        assertThrows(IOException.class, () -> ReadLineCompleteDelegation.readLineCompleteDelegation("src/main/resources/missing-file.txt"));
        assertEquals("aahing",ReadLineCompleteDelegation.readLineCompleteDelegation("exercises/src/main/java/com/SilviaFerrari/resources/file1.txt"));
    }
}