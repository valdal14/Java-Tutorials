package com.valdal14.multithreading.synchusecase;

public class DisplayMessage {

    public synchronized void sayHello(String name){
        for (int i = 1; i <= 10;i++){
            try {
                System.out.println("How are you " + name + "?");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
    }
}
