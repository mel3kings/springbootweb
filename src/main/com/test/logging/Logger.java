package com.test.logging;

public interface Logger {
    void log(String event);
    void log(String id, String event);
    String getEventId();
}
