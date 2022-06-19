package com.valdal14.encapsulation.usecaseexample;

public class Event implements EventManager {

    private int eventId;

    public int getEventId() {
        return eventId;
    }

    private void setEventId(int eventId) {
        this.eventId = eventId;
    }

    @Override
    public Event create(int id) {
        if(id <= 0) {
            throw new RuntimeException("ID event is not valid");
        } else {
            this.setEventId(id);
        }
        return null;
    }
}
