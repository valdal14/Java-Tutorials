package com.valdal14.collections.collectionsandarrays;

import java.util.*;

public class CollectionsClassAndArrayClassDemo {

    public static void main(String[] args) {

        Random rand = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Integer num = rand.nextInt(5);
            list.add(num);
        }

        System.out.println(list);
        // [1, 3, 0, 0, 4, 2, 2, 4, 0, 3]

        System.out.println("--- COLLECTIONS CLASS STATIC METHODS ---");

        // reverse
        Collections.reverse(list);
        System.out.println(list);
        // [3, 0, 4, 2, 2, 4, 0, 0, 3, 1]

        // sort
        Collections.sort(list);
        System.out.println(list);
        // [0, 0, 0, 1, 2, 2, 3, 3, 4, 4]

        // binarySearch returns position of an object in a sorted list
        int found = Collections.binarySearch(list, 2);
        System.out.println("The number two was found at index: " + found);
        System.out.println("Confirming we got the number 2 in the list: " + list.get(found) + "\n");

        // Revert with a comparator
        Collections.sort(list, new MyComparator());
        System.out.println(list);
        // [4, 4, 4, 4, 4, 4, 2, 2, 1, 1]

        System.out.println("--- ARRAY CLASS STATIC METHODS ---");

        Integer arr[] = new Integer[10];

        for (int i = 0; i < 10; i++) {
            Integer num = rand.nextInt(5);
            arr[i] = num;
        }

        // print array
        CollectionsClassAndArrayClassDemo.printArrayInfo(arr);

        // sort
        Arrays.sort(arr);
        CollectionsClassAndArrayClassDemo.printArrayInfo(arr);
        // [0, 0, 0, 0, 1, 2, 2, 4, 4, 4]

        // revert with comparator
        Arrays.sort(arr, new MyComparator());
        CollectionsClassAndArrayClassDemo.printArrayInfo(arr);
        // [4, 4, 3, 2, 1, 1, 1, 0, 0, 0]

        // binarySearch returns position of an object in a sorted list
        int foundValue =  Arrays.binarySearch(arr, 2);
        System.out.println("The number two was found at index: " + foundValue);
        System.out.println("Confirming we got the number 2 in the list: " + arr[foundValue] + "\n");

    }

    private static void printArrayInfo(Integer[] arr){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if(i < arr.length - 1){
                sb.append(", ");
            }
        }
        sb.append("]\n");
        System.out.println(sb.toString());
    }
}
