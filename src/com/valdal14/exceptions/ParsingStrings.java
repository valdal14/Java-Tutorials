package com.valdal14.exceptions;

import java.util.Scanner;

public class ParsingStrings {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");

        try {
            int i = Integer.parseInt(ParsingStrings.sc.next()); // NumberFormatException
            System.out.println(i);
        } catch (NumberFormatException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.print("The program will be terminated!!!");
        }
    }
}
