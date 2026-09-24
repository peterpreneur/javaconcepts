package com.peterpreneur;

@FunctionalInterface
public interface EmailSenderBoolean {
    boolean send(String from, String to);
}