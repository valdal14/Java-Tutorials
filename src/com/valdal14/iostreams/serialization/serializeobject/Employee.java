package com.valdal14.iostreams.serialization.serializeobject;

import java.io.Serializable;

public class Employee implements Serializable {

    int id;
    String name;
    double salary;
    // we will not serialize this
    transient int ssn;

    public Employee(int id, String name, double salary, int ssn) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.ssn = ssn;
    }

    public void printEmployeeInfo(){
        System.out.printf("Employee info: ID: %d - NAME: %s, SALARY: %f.2 - SSN: %s \n", this.id, this.name, this.salary, this.ssn);
    }
}
