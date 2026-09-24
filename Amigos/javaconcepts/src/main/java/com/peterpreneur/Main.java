package com.peterpreneur;

public class Main {
    public static void main(String[] args) {
        EmailSender gmail = (from, to) -> System.out.println("Gmail from " + from + " to " + to);
        gmail.send("from@gmail.com","to@gmail.com");

        EmailSender hotmail = (from, to) -> System.out.println("Hotmail from " + from + " to " + to);
        hotmail.send("from@hotmail.com", "to@hotmail.com");
    };
}