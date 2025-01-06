package com.SilviaFerrari.main.collections.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InvertMap {
    public static Map<String, Integer> invertMap(Map<Integer, String> src){
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (Map.Entry<Integer, String> entry : src.entrySet()) {
            map.put(entry.getValue(), entry.getKey());
        }
        return map;
    }
}
