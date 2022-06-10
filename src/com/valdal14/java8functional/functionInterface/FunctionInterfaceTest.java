package com.valdal14.java8functional.functionInterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterfaceTest {

    public static void main(String[] args) {

        // Type and Return Type
        Function<String, Integer> func = (str)-> str.length();
        Integer strLength = func.apply("Hello World!!!");
        System.out.println("The length of the string is: " + strLength);

        // Use case with Inner Class
        InnerClassCustomer customerOne = new InnerClassCustomer("Valerio", "D'Alessio");
        InnerClassCustomer customerTwo = new InnerClassCustomer("Leo", "Masia");

        System.out.println(customerOne.getFullName());
        System.out.println(customerTwo.getFullName());
    }

    static class InnerClassCustomer {
        private String name;
        private String lastname;

        private String fullName;

        private static final Integer MAXFULLNAMELENGHTALLOWED = 10;

        // Function Interface
        private static final Function<String, Integer> fullNameLength = (str)-> str.length();

        // Predicate
        private static final Predicate<Integer> checkFullNameMaxLenghtAllowed = num -> num <= InnerClassCustomer.MAXFULLNAMELENGHTALLOWED;

        public InnerClassCustomer(String name, String lastname) {
            this.name = name;
            this.lastname = lastname;
            // set the fullname
            this.setFullName();
        }

        public String getName() {
            return name;
        }

        public String getLastname() {
            return lastname;
        }

        public String getFullName() {
            return fullName;
        }

        private void setFullName(){
            String fullName = this.getName() + " " + this.getLastname();
            // Using the Function Interface fullNameLength to get the length
            Integer fullNameLength = InnerClassCustomer.fullNameLength.apply(fullName);
            // Using the predicate to verify if we stay below the max
            boolean isValidFullName = InnerClassCustomer.checkFullNameMaxLenghtAllowed.test(fullNameLength);
            if(isValidFullName) {
                this.fullName = fullName;
            } else {
                this.fullName = "Invalid Full Name size";
            }
        }
    }

}
