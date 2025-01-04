package com.SilviaFerrari.main.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second){
        Set<Integer> union = new HashSet<Integer>(first);
        for (Integer i : second) {
            union.add(i);
        }
        return union;
    }

    public static Set<Integer> unionAddAll(Set<Integer> first, Set<Integer> second){
        Set<Integer> union = new HashSet<Integer>(first);
        union.addAll(second);
        return union;
    }
}
