package com.valdal14.java9features.InterfacesWithPrivateMethods;

public interface SendNotificationInterface {

    default void sendNotifications() throws InterruptedException {
        establishConnection();
        System.out.println("Sending multiple notifications");
    }

    default void sendNotification() throws InterruptedException {
        establishConnection();
        System.out.println("Sending notification");
    }

    private void establishConnection() throws InterruptedException {
        System.out.println("Establishing connection....");
        Thread.sleep(2000);
    }

    static void notificationsSent(){
        System.out.println("All notification are sent...");
    }
}
