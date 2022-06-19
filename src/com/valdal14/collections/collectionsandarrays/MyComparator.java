package com.valdal14.collections.collectionsandarrays;

import java.util.Comparator;

// reverse the list

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer integer, Integer t1) {
        if(t1 < integer){
            return -1;
        } else if (t1 > integer) {
            return 1;
        } else {
            return 0;
        }
    }
}
