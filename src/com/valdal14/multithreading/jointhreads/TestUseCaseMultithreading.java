package com.valdal14.multithreading.jointhreads;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestUseCaseMultithreading extends Thread {

    private static int sum = 0;
    private static int userPick;
    private static boolean isInvalidInput = true;

    public static void main(String[] args) throws InterruptedException {

        // Start a timer
        long start = System.currentTimeMillis();

        while (isInvalidInput){
            try {
                TestUseCaseMultithreading.userPick = TestUseCaseMultithreading.askUserForInteger();
                TestUseCaseMultithreading.isInvalidInput = false;
            } catch (InputMismatchException e){
                System.out.println("Invalid input, please try again");
            }
        }

        TestUseCaseMultithreading test = new TestUseCaseMultithreading();
        test.start();

        // We do not want this line to be executed until the previous thread has finished its work
        test.join();
        System.out.println("--- SUM DONE ---");
        System.out.println("The sum of the first " + TestUseCaseMultithreading.userPick + " numbers is " + TestUseCaseMultithreading.sum);

        // End time
        long end = System.currentTimeMillis();
        System.out.println("Program execution duration was " + ((end - start) * 0.001) + " seconds");
    }

    /**
     * Ask the user ro enter an integer value
     */
    private static int askUserForInteger() throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid integer: ");
        return sc.nextInt();
    }

    @Override
    public void run() {
        int pickedNumber = TestUseCaseMultithreading.userPick;
        int counter = Math.abs(pickedNumber);
        TestUseCaseMultithreading.sum = 0;
        for(int i = counter; i != 0; i--){
            sum += i;
            try {
                Thread.sleep(1000);
                System.out.println("Partial sum: " + sum);
            } catch (InterruptedException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
    }
}
