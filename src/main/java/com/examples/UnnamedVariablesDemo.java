package com.examples;

public class UnnamedVariablesDemo {
    void main() {
        String[] names = {"Alice", "Bob", "Charlie"};

        for (String _ : names) {
            System.out.println("Skipping actual value, just looping...");
        }
    }
}

