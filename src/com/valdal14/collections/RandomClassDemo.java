package com.valdal14.collections;

import java.util.Random;

/**
 * We will use this while working with Sets
 */

public class RandomClassDemo {

    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);
        System.out.println(x);
    }
}
