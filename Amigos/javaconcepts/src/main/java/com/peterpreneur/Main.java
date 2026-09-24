package com.peterpreneur;

public class Main {
    public static void main(String[] args) {
        EmailSender gmail = () -> System.out.println("Gmail send");
        gmail.send();

        EmailSender hotmail = () -> System.out.println("Hotmail send");
        hotmail.send();
    };
}