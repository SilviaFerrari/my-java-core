package com.SilviaFerrari.test.collections.treeSet;

import com.SilviaFerrari.main.collections.treeSet.WordAfterWord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordAfterWordTest {
    final String filename = "exercises/src/main/java/com/SilviaFerrari/resources/james-joyce-ulysses.txt";

    @Test
    void wordFrequency() throws IOException {
        Assertions.assertEquals("yesterdays", WordAfterWord.wordAfterWord(filename, "yesterday"));
        assertEquals("gold", WordAfterWord.wordAfterWord(filename, "goings"));
        assertEquals("zero", WordAfterWord.wordAfterWord(filename, "zermatt"));
    }
}