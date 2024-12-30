package com.SilviaFerrari.test.strings;

import com.SilviaFerrari.main.strings.Reverse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverseCharAt() {
        assertEquals("tset gnirtS", Reverse.reverseCharAt("String test"));
        assertEquals("eoD nhoJ", Reverse.reverseCharAt("John Doe"));
        assertEquals("!dlroW olleH", Reverse.reverseCharAt("Hello World!"));
    }

    @Test
    void reverseStringBuilder() {
        assertEquals("tset gnirtS", Reverse.reverseStringBuilder("String test"));
        assertEquals("eoD nhoJ", Reverse.reverseStringBuilder("John Doe"));
        assertEquals("!dlroW olleH", Reverse.reverseStringBuilder("Hello World!"));
    }
}