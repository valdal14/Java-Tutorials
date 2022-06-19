package com.valdal14.collections.maps.usecaseweakhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) throws InterruptedException {

        Map<User, String> map = new HashMap<>();

        User u = new User(); // u memory location 918221580
        System.out.println(u.hashCode()); // 918221580
        map.put(u, "Tom");

        System.out.println(map);

        // remove the reference in memory despite the HashMap is still using it
        u = null;

        System.gc();
        Thread.sleep(5000);

        System.out.println(map);
        // The map still hold the u {User=Tom}

        // Now let's see how a WeakHashMap will behave
        System.out.println("--- WEAKHASHMAP DEMO ---");
        Map<User, String> weakHashMap = new WeakHashMap<>();
        User z = new User();
        weakHashMap.put(z, "Tom");

        System.out.println(weakHashMap);
        // remove the reference in memory
        z = null;
        // invoke the Garbage Collectors
        System.gc();
        Thread.sleep(5000);
        System.out.println(weakHashMap);
        // {}
        // the WeakHashMap does no longer have a reference to the User z


    }
}
