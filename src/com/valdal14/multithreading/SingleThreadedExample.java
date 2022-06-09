package com.valdal14.multithreading;

public class SingleThreadedExample {

    public static void main(String[] args) {

        SingleThreadedExample st = new SingleThreadedExample();
        st.printNumbers();

        System.out.println("");

        for(int j = 1; j <= 200; j++){
            System.out.print("j: " + j + "\t");
        }
    }

    void printNumbers(){
        for(int i = 1; i <= 200; i++){
            System.out.print("i: " + i + "\t");
        }
    }
}
