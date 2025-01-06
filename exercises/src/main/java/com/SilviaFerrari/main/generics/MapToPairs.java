package com.SilviaFerrari.main.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapToPairs {
    public static <K, V> List<Pair<K, V>> mapToPairs(Map<K, V> src){
        List<Pair<K, V>> pairs = new ArrayList<>();
        for (Map.Entry<K, V> entry : src.entrySet()) {
            pairs.add(new Pair<>(entry.getKey(), entry.getValue()));
        }
        return pairs;
    }
}
