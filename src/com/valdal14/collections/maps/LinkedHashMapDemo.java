package com.valdal14.collections.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        // Ordered Collection
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        // add elements
        linkedHashMap.put("Val", 43);
        linkedHashMap.put("Leo", 46);
        linkedHashMap.put("Grazia", 8);
        // Iterate over
        for (String key : linkedHashMap.keySet()) {
            System.out.println("Key: " + key + " Value: " + linkedHashMap.get(key));
        }
    }
}
