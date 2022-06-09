package com.valdal14.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexOutOfBoundsExceptionExample {

    private static Scanner sc = new Scanner(System.in);
    private static List<String> myList = new ArrayList<>();

    public static void main(String[] args) {

        IndexOutOfBoundsExceptionExample.myList.add("Hello");
        IndexOutOfBoundsExceptionExample.myList.add("Ciao");

        try {
            System.out.println(IndexOutOfBoundsExceptionExample.myList.get(5)); // ArrayIndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("The program will be terminated!!!");
        }
    }
}
