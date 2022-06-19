package com.valdal14.Java13And14Features.Records;

public class RecordsDemo {

    // Simple record
    record Person (String name, String lastName, int age){}

    public static void main(String[] args) {

        // Person record instance
        Person person = new Person("Val", "Dal", 30);
        // hashcode
        System.out.println(person.hashCode());
        // toString
        System.out.println(person.toString());
        // getter
        int age = person.age();
        System.out.println(age);
    }
}
