package com.valdal14.java9features.InterfacesWithPrivateMethods;

public class Demo implements SendNotificationInterface {

    // runtime poly
    // interface i = new class()
    private static SendNotificationInterface demo = new Demo();

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(()-> {
            try {
                Demo.demo.sendNotification();
                Demo.demo.sendNotifications();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        t.start();
        t.join();
        // invoke the static method
        SendNotificationInterface.notificationsSent();




    }
}
