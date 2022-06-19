package com.valdal14.collections.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        // add elements
        map.put("Val", 43);
        map.put("Leo", 46);
        map.put("Grazia", 8);
        // get a set of keys
        Set<String> setOfKeys = map.keySet();
        System.out.println(setOfKeys);
        // get all values
        Collection<Integer> setofValues = map.values();
        System.out.println(setofValues);
        // get both by iteration
        for (String key: setOfKeys) {
            System.out.println("Key: " + key + " Values: " + map.get(key));
        }
    }
}
