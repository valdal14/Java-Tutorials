package com.valdal14.encapsulation.usecaseexample;

public class TestEventManagerUseCase {

    public static void main(String[] args) {
        Event newEvent = new Event();
        newEvent.create(22323232);
        System.out.println("Event id: " + newEvent.getEventId());
    }
}

