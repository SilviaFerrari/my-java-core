package com.SilviaFerrari.test.collections.sets;

import com.SilviaFerrari.main.collections.sets.RemoveDuplicates;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    @Test
    void removeDuplicates() {
        assertEquals(List.of(1, 2, 3, 4, 5), RemoveDuplicates.removeDuplicates(List.of(1, 2, 3, 4, 5)));
        assertEquals(List.of(1, 2), RemoveDuplicates.removeDuplicates(List.of(1, 1, 1, 2, 2)));
        assertEquals(List.of(1), RemoveDuplicates.removeDuplicates(List.of(1, 1, 1)));
        assertEquals(List.of(), RemoveDuplicates.removeDuplicates(List.of()));
    }

    void removeDuplicatesWithCheck() {
        assertEquals(List.of(1, 2, 3, 4, 5), RemoveDuplicates.removeDuplicates(List.of(1, 2, 3, 4, 5)));
        assertEquals(List.of(1, 2), RemoveDuplicates.removeDuplicates(List.of(1, 1, 1, 2, 2)));
        assertEquals(List.of(1), RemoveDuplicates.removeDuplicates(List.of(1, 1, 1)));
        assertEquals(List.of(), RemoveDuplicates.removeDuplicates(List.of()));
    }
}