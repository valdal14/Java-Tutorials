package com.valdal14.multithreading.synchblocks;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<Person> personList;

    public Customer(){
        personList = new ArrayList<>();
    }

    // Synch Block
    public void addPersonToCustomerList(Person person){
        System.out.printf("%s started adding a new Person to the customer list... \n", Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            // new synch block
            // this
            // this.personList
            // Customer.class (class level lock)
            synchronized (this.personList){
                this.personList.add(person);
            }
            System.out.printf("The person was added to the list by %s \n", Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        this.personList.add(person);
    }

    public void printListOfCustomer(){
        if(this.personList.size() <= 0) {
            System.out.println("The list of customer is empty");
        } else {
            this.personList.stream()
                    .forEach(Customer::printStreamOfPerson);
        }
    }

    private static void printStreamOfPerson(Person p){
        System.out.printf("Customer's name: %s - Customer's lastname: %s \n", p.getName(), p.getLast());
    }

}
