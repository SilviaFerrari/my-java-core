package com.SilviaFerrari.test.oop.reverse;

import com.SilviaFerrari.main.oop.reverse.Reverser;
import com.SilviaFerrari.main.oop.reverse.ReverserSlow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverserSlowTest {

    @Test
    void reverse() {
        Reverser r = new ReverserSlow();
        assertEquals("!dlroW olleH", r.reverse("Hello World!"));
    }
}