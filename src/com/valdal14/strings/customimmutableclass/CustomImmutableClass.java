package com.valdal14.strings.customimmutableclass;

public class CustomImmutableClass {

    int x;

    CustomImmutableClass(int x){
        this.x = x;
    }

    /**
     * If the Object has changed we return a new Object
     * @param x
     * @return this or new CustomImmutableClass Object
     */
    public CustomImmutableClass change(int x){
        // check if the object has changed
        return this.x == x ? this : new CustomImmutableClass(x);
    }

    public static void main(String[] args) {
        CustomImmutableClass m1 = new CustomImmutableClass(10);
        CustomImmutableClass m2 = m1.change(10); // passing the same value

        // m2 should be equal in memory to m1 since we did not change its value
        System.out.println(m1 == m2); // check equality in memory     -- true
        System.out.println(m1.equals(m2)); // check equality by value -- true

        // m3 should NOT be equal in memory to m1 since we did change its value
        CustomImmutableClass m3 = m1.change(20); // passing the same value

        System.out.println(m1 == m3); // check equality in memory     -- false
        System.out.println(m1.equals(m3)); // check equality by value -- false
    }
}
