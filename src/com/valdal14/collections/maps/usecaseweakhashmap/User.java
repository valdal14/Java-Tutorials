package com.valdal14.collections.maps.usecaseweakhashmap;

public class User {

    @Override
    public String toString() {
        return "User";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized Called");
    }
}
