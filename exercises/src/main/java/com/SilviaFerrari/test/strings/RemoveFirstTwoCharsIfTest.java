package com.SilviaFerrari.test.strings;

import com.SilviaFerrari.main.strings.RemoveFirstTwoCharsIf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoCharsIfTest {

    @Test
    void removeFirstTwoCharsCharAt() {
        assertEquals("e pen is on the table", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("The pen is on the table"));
        assertEquals("Hello World!", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("Hello World!"));
        assertEquals("od World!", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("Good World!"));
        assertEquals("H", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("Ho"));
        assertEquals("e", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("Ne"));
        assertEquals("", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("Y"));
        assertEquals("H", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("H"));
        assertEquals("", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt(""));
    }

    @Test
    void removeFirstTwoCharsStringBuilder() {
        assertEquals("e pen is on the table", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("The pen is on the table"));
        assertEquals("Hello World!", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("Hello World!"));
        assertEquals("od World!", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("Good World!"));
        assertEquals("H", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("Ho"));
        assertEquals("e", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("Ne"));
        assertEquals("", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("Y"));
        assertEquals("H", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("H"));
        assertEquals("", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder(""));
    }
}