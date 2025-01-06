package com.SilviaFerrari.main.collections.maps;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValuesKeys {
    public static boolean valuesKeys(Map<String, String> map){
        Set<String> intersection = new HashSet<>(map.keySet());
        intersection.retainAll(new HashSet<>(map.values()));
        return !intersection.isEmpty();
    }
}
