package com.valdal14.assertions.usecase;

public class Main {

    public static void main(String[] args) {

        int withdrawAmount = 100;
        int currentBalance = 60;

        //assert (withdrawAmount < currentBalance):("You cannot widthdraw more than what you own");

        assert (withdrawAmount < currentBalance):(Main.returnAssertError());
    }

    private static String returnAssertError(){
        return "ou cannot widthdraw more than what you own";
    }
}
