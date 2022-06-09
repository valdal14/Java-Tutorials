package com.valdal14.strings;

public class StringClass {

    /**
     *  STRING CLASS ----------------------------------------------------------------------------------------------
     *
     *  -> java.lang.String
     *  -> In JAVA Strings are immutable
     *      --> Once an Object of type Strings is created we cannot change it
     *      --> the JVM will allocate a String Pool (special memory place) on the heap and this will give better
     *          performances
     *      --> The String immutability also helps with Thread Safety. If multiple Threads are accessing the
     *          same String and one Thread is manipulating the value while another thread is reading it we are ok
     *          because when the thread that change the value the String will point to a different location
     *          meanwhile the old value is still available in the String Pool
     *  -> The JVM will only print the value of the IMMUTABLE Object and not of the Mutable Objects
     *  -----------------------------------------------------------------------------------------------------------
     *
     *      ->      STRING    -    STRINGBUFFER    -    STRINGBUILDER ---------------------------------------------
     *           Immutable           Mutable                Mutable
     *                             Synchronized         Not Synchronized
     *                             (all methods)
     *
     *      -> If we want to deal with IMMUTABLE Strings we should use STRING
     *      -> If we want to deal with MUTABLE Strings we should use STRINGBUFFER
     *      -> But if we want ourselves to take care of the Multithreading and we want the Mutability we can go
     *         with the STRINGBUFFER
     *  -----------------------------------------------------------------------------------------------------------
     */

    public static void main(String[] args) {
        // Create String Object ------------------------------
        String s1 = "String 1"; // String literal
        String s2 = new String("String 2");
        // Create a string from a char array
        char c[] = {'V', 'D', '1', '4'};
        String s3 = new String(c);
        // Create a String from a byte array
        byte b[] = {65,66,67,68};
        String s4 = new String(b);
        System.out.println(s4);
        // ---------------------------------------------------

        // Strings and Wrappers Types ------------------------
        class InnerProduct {
            int id;
            String name;

            public InnerProduct(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }

        InnerProduct innerProduct = new InnerProduct(1, "iPhone");
        // JVM will print the object reference
        System.out.println(innerProduct);
        // Wrapper type
        Integer integer = 456;
        System.out.println(integer);
        // ---------------------------------------------------

        // String Immutability -------------------------------

        /**
         *  The value to the memory location of the first
         *  assignment String newStr = "Hello"; will not
         *  be changed. The JVM will create a new memory
         *  location address for the new value newStr = "world";
         *
         *  When we create a new String with the same value the
         *  new String will point at the same memory address
         */

        String newStr = "Hello";
        newStr = "world";

        // point to the same memory location of the Hello value
        String pointToMemoryHello = "Hello";
        // ---------------------------------------------------

        // IMMUTABLE VALUES ----------------------------------
        class InnerUser {
            int id;
            String name;

            public InnerUser(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }

        InnerUser innerUser = new InnerUser(1, "Val");
        System.out.println(innerUser); // com.valdal14.strings.StringClass$1InnerUser@5ca881b5

        String newS = new String("Grazia");
        System.out.println(newS); // Grazia - Displays the value and not the reference obj
        // This is becuase the String newS is a String and it is immutable while user is mutable

        String s = "Hello";
        String world = "World";
        System.out.println("Before concatenation: " + "\ns:" + s + "\nworld: " + world);
        // Concat the Strings
        String newConcatString = s.concat(world);
        System.out.println("After concatenation: " + "\ns:" + s + "\nworld: " + world);
        // the value will not change they are immutable
        System.out.println(newConcatString);
        // ---------------------------------------------------


        // STRING POOL ---------------------------------------

        System.out.println("--- STRING POOL ---");
        InnerUser innerUserOne = new InnerUser(1, "Val");
        InnerUser innerUserTwo = new InnerUser(1, "Grazia");

        System.out.println(innerUserOne); // com.valdal14.strings.StringClass$1InnerUser@54bedef2
        System.out.println(innerUserTwo); // com.valdal14.strings.StringClass$1InnerUser@5caf905d

        String userOne = "ABC";
        String userTwo = "ABC";

        // Same momory location
        System.out.println(userOne); // 64578
        System.out.println(userTwo); // 64578
        // Get the memory location
        System.out.println(userOne.hashCode()); // 64578
        System.out.println(userTwo.hashCode()); // 64578
        // ---------------------------------------------------


        // STRING COMPARISON ---------------------------------
        String userThree = "XYZ";
        System.out.println(userOne == userTwo); // check the memory location and compare
        System.out.println(userOne.equals(userTwo)); // compare the content of the strings itself

        System.out.println(userOne == userThree);
        System.out.println(userOne.equals(userThree));

        // using the String constructor
        System.out.println("--- Equality with String Constructor ---");
        String userFour = new String("ABC"); // new memory location created
        System.out.println(userOne == userFour); // compare the same memory location -> false
        System.out.println(userOne.equals(userFour)); // compare the value -> true

        // Note: the .equals is overridden by the String class
        // and compares the value instead of the location
        // ---------------------------------------------------

        // OBJECT COMPARISON ---------------------------------
        System.out.println("--- OBJECTS COMPARISON ---");
        System.out.println(innerUserOne == innerUserTwo); // check memory location
        System.out.println(innerUserOne.equals(innerUserTwo)); // check values
        // Note: Let's now create an Object with the same values
        InnerUser innerUserThree = new InnerUser(1, "Val");
        System.out.println(innerUserThree == innerUserTwo); // check memory location
        System.out.println(innerUserThree.equals(innerUserOne)); // check values but still false

        // Note: The default implementation of the .equals is not
        // overridden by the Object class unless we override it
        // manually
        // ---------------------------------------------------



    }
}
