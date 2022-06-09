package com.valdal14.collections.maps;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                Integer sl1 = s.length();
                Integer sl2 = s.length();

                if(sl1 < sl2){
                    return -1;
                } else if (sl1 > sl2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        // add element
        treeMap.put("Valerio", 10);
        treeMap.put("Leo", 20);
        treeMap.put("Grazia", 8);
        // it will be sorted by we can change the
        // default sorting using a comparator like above
        System.out.println(treeMap);
    }

}
