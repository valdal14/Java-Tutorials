package com.valdal14.objectsclassmethods;

import java.util.UUID;

public class Passenger {

    private String firstName;
    private String lastName;

    private int id;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Passenger information: Firstname: " + this.getFirstName() + " - Lastname: " + this.getLastName();
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        // cast it to the passenger object
        Passenger pass = (Passenger) obj;
        Integer passId = this.getId();
        return passId.equals(pass.getId()) && pass.getFirstName().equals(this.getFirstName()) && pass.getLastName().equals(this.getLastName()) ? true : false;
    }
}
