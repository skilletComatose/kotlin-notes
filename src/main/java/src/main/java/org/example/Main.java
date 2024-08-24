package org.example;

import org.example.customthings.CustomStreamImpl;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        new CustomStreamImpl<>(names)
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}