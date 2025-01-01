package com.SilviaFerrari.test.oop.reverse;

import com.SilviaFerrari.main.oop.reverse.Reverser;
import com.SilviaFerrari.main.oop.reverse.ReverserFast;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverserFastTest {

    @Test
    void reverse() {
        Reverser r = new ReverserFast();
        assertEquals("!dlroW olleH", r.reverse("Hello World!"));
    }
}