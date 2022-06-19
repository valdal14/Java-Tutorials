package com.valdal14.exceptions;

public class ArrayOutofBoundExample {

    public static void main(String[] args) {
        int arr[] = {0,1,2};

        try{
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("The Program will be terminated!!!");
        }
    }
}
