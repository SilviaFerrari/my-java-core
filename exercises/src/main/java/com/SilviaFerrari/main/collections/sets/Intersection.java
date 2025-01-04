package com.SilviaFerrari.main.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){
        Set<Integer> intersection = new HashSet<Integer>();
        for (Integer i : first) {
            if (second.contains(i)) {
                intersection.add(i);
            }
        }
        return intersection;
    }

    public static Set<Integer> intersectionRetainAll(Set<Integer> first, Set<Integer> second){
        Set<Integer> intersection = first;
        intersection.retainAll(second);
        return intersection;
    }
}
