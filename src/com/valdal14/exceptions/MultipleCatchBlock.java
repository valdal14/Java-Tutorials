package com.valdal14.exceptions;

public class MultipleCatchBlock {

    private static int output;

    public static void main(String[] args) {

        try {
            String input = args[0];
            System.out.println("Input is " + input);
            MultipleCatchBlock.output = Integer.parseInt(input);
            System.out.println("Output is " + output);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Input is required");
        } catch (NumberFormatException e){
            System.out.println("The input must be a integer");
        }

        try {
            // Divided by 0 but handle it with the parent exception
            double res = output / 0;
            System.out.println(res);
        } catch (RuntimeException e){
            System.out.println("Cannot divide by 0 " + e.getMessage());
        } finally {
            System.out.println("More code.....");
        }
    }
}
