package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            int key = entry.getKey().length();
            Set<String> values = new HashSet<>();
            for (Map.Entry<String, Integer> e : sourceMap.entrySet()) {
                if (e.getKey().length() == key) {
                    values.add(e.getKey());
                }
            }
            System.out.println(values);
            result.put(key, values);
        }
        System.out.println(result);
        return result;
    }
}
