package com.SilviaFerrari.main.collections.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicatesWithCheck(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        return new ArrayList<>(new HashSet<>(list));
    }
}
