package com.valdal14.collections.lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        // Create an Array of Objects
        Object object[] = new Object[1000000];

        for (int i = 0; i < object.length; i++) {
            object[i] = new Object();
        }

        /**
         * Using Runtime Poly if we switch from LinkedList to
         * ArrayList we will see it will take much longer to
         * store 100K elements in the ArrayList in comparison
         * with the LinkedList
         */

        // Now let's create a LinkedList
        List<Object> list = new LinkedList<>();
        long start = System.currentTimeMillis();
        for(Object obj : object){
            list.add(obj);
        }
        long end = System.currentTimeMillis();

        System.out.println("The time took to store 100K in the LinkedList was: " + (end - start) / 60 + " seconds");
    }
}
