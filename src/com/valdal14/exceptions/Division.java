package com.valdal14.exceptions;

import java.util.Scanner;

public class Division {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int c = a / b; // ArithmeticException
        } catch (ArithmeticException e){
            System.out.println("Error message: " + e.getMessage() + " caused by: " + e.getCause());
        } finally {
            System.out.println("The program will be terminated....");
        }
    }
}
