package com.SilviaFerrari.test.collections.maps;

import com.SilviaFerrari.main.collections.maps.WordFrequency;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyTest {
    final String filename = "exercises/src/main/java/com/SilviaFerrari/resources/james-joyce-ulysses.txt";
    @Test
    void wordFrequency() throws IOException {
        assertEquals(1, WordFrequency.wordFrequency(filename).get("zulu"));
        assertEquals(2, WordFrequency.wordFrequency(filename).get("velocipedes"));
        assertEquals(3, WordFrequency.wordFrequency(filename).get("bachelor"));
    }
}