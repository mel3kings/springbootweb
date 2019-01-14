package com.test.logging;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsoleLogger implements Logger {

    public void log(String event) {
        System.out.println(String.format("Event id : %s occurred with %s ", getEventId(), event));
    }

    public void log(String id, String event) {
        System.out.println(String.format("Event id : %s occurred with %s ", id, event));
    }

    public String getEventId() {
        return UUID.randomUUID().toString();
    }
}
