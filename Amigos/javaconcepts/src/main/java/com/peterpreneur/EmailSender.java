package com.peterpreneur;

@FunctionalInterface
public interface EmailSender {
    void send(String from, String to);
}