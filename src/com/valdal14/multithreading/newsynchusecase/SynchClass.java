package com.valdal14.multithreading.newsynchusecase;

public class SynchClass {

    public static synchronized void m1(){
        for (int i = 0; i <= 5; i++){
            System.out.println("This is a static synchronized m1() method");
        }
    }

    public static synchronized void m2(){
        for (int i = 0; i <= 5; i++){
            System.out.println("This is a static synchronized m2() method");
        }
    }

    public static void m3(){
        for (int i = 0; i <= 5; i++){
            System.out.println("This is a static m3() method");
        }
    }

    public synchronized void m4(){
        for (int i = 0; i <= 5; i++){
            System.out.println("This is a synchronized m4() method");
        }
    }

    public void m5(){
        for (int i = 0; i <= 5; i++){
            System.out.println("This is an instance m5() method");
        }
    }

}
