package com.valdal14.objectsclassmethods;

public class PasssengerDemo {

    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        passenger.setFirstName("Valerio");
        passenger.setLastName("DAlessio");
        passenger.setId(123456789);

        Passenger passenger1 = new Passenger();
        passenger1.setFirstName("Valerio");
        passenger1.setLastName("DAlessio");
        passenger1.setId(123456789);

        System.out.println(passenger == passenger1);
        System.out.println(passenger.equals(passenger1));

        // print it
        System.out.println(passenger);

        // The JAVA code says that "equals returns true then hashcode value must be the same"
        System.out.println(passenger.hashCode()); // 123456789
        System.out.println(passenger1.hashCode()); // 123456789
    }
}
