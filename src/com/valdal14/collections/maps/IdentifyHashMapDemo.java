package com.valdal14.collections.maps;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentifyHashMapDemo {

    public static void main(String[] args) {

        Map<Integer, String> identityHashMap = new IdentityHashMap<>();
        // add element
        identityHashMap.put(10, "Val");
        identityHashMap.put(10, "Leo");

        System.out.println(identityHashMap);

        // {10=Leo}

        // Let's try
        Integer id1 = 20;
        Integer id2 = 20;

        identityHashMap.put(id1, "Val");
        identityHashMap.put(id2, "Val");

        System.out.println(identityHashMap);
        // {10=Leo, 20=Val}

        IdentityHashMap<Integer, String> iMap = new IdentityHashMap<>();
        // add element
        iMap.put(10, "Val");
        iMap.put(10, "Leo");
        iMap.put(id1, "Val");
        iMap.put(id2, "Val");

        System.out.println(iMap);
        // {10=Leo, 20=Val}
    }
}
