package com.peterpreneur;

public class Main {
    public static void main(String[] args) {
        EmailSender gmail = () -> System.out.println("Gmail-1");
        gmail.send();

        EmailSender hotmail = () -> System.out.println("Hotmail-1");
        hotmail.send();
    };
}