package com.demo;

import java.util.ArrayList;
import java.util.List;

public class TestingCode {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Deliberate minor syntax error: missing closing parenthesis ')'
        System.out.println("Total names: " + names.size())

        System.out.println("Execution finished.");
    }
}
