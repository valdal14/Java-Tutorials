package com.valdal14.multithreading.synchronization;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<Customer> customerList = new ArrayList<>();
    private String firstName;
    private String lastName;
    private long customerId;

    public Customer(String firstName, String lastName, long customerId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerId = customerId;
    }

    public synchronized void addCustomersToList(String firstName, String lastName, long customerId){
        this.customerList.add(new Customer(firstName, lastName, customerId));
    }

    public synchronized void removeCustomerFromList(int id){
        try{
            this.customerList.remove(id);
        } catch (Exception e){
            System.out.println("Cannot remove customer in that position" + e.getMessage());
        }
    }

    public void getCustomer(int id){
        try{
            this.printCustomerInfo(id);
        } catch (Exception e){
            System.out.println("Cannot get customer in that position" + e.getMessage());
        }
    }

    public void printCustomerListSize(){
        System.out.println("Customer List Size: " + this.customerList.size());
    }

    private void printCustomerInfo(int id){
        try{
            Customer c = this.customerList.get(id);
            System.out.printf("FirstName: %s - LastName: %s - Customer ID: %d \n", c.firstName, c.lastName, c.customerId);
        } catch (Exception e){
            System.out.println("Cannot get customer in that position" + e.getMessage());
        }
    }


}
