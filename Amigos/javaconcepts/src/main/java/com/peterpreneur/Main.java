package com.peterpreneur;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmailSender gmail = (from, to) -> System.out.println("Gmail from " + from + " to " + to);
        gmail.send("from@gmail.com", "to@gmail.com");

        EmailSender hotmail = (from, to) -> System.out.println("Hotmail from " + from + " to " + to);
        hotmail.send("from@hotmail.com", "to@hotmail.com");

        EmailSenderBoolean gmailBoolean = (from, to) -> true;
        System.out.println(gmailBoolean.send("from@gmail.com", "to@gmail.com"));

        String[] nums = { "One", "Two", "Three" };
        for (String num : nums) {
            System.out.println(num);
        }

        List<String> names = List.of("Matt", "Mark", "Luke");
        // // regular for each
        // for (String name : names) {
        // System.out.println("ForEach: " + name);
        // }

        // for each with Lambda
        names.forEach(name -> System.out.println("Lambda ForEach: " + name));

        // Consumer<String> consumer = System.out::println;

        names.forEach(System.out::println);

        // Consumer<String> consumer = name -> System.out.println("Consumer: " + name);
        // names.forEach(name -> System.out.println("Consumer: " + name.toUpperCase()));
    };
}