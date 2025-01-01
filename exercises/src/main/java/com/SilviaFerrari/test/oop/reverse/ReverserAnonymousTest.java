package com.SilviaFerrari.test.oop.reverse;

import com.SilviaFerrari.main.oop.reverse.Reverser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverserAnonymousTest {
    @Test
    void reverse() {
        Reverser r = new Reverser() {
            @Override
            public String reverse(String s) {
                return new StringBuilder(s).reverse().toString();
            }
        };
        assertEquals("!dlroW olleH", r.reverse("Hello World!"));
    }
}