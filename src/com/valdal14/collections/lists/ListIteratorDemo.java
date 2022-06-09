package com.valdal14.collections.lists;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("abc");
        list.add("def");
        list.add("xyz");

        ListIterator<String> itr = list.listIterator();

        // forward
        System.out.println("--- ListIterator Forward ---");
        while (itr.hasNext()) {
            System.out.printf("List index: %d and List value: %s \n", itr.nextIndex(), itr.next());
        }

        // backward
        System.out.println("--- ListIterator Backward ---");
        while (itr.hasPrevious()) {
            System.out.printf("List index: %d and List value: %s \n", itr.previousIndex(), itr.previous());
        }
    }
}
