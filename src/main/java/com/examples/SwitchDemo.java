package com.examples;

/**
 * More powerful switch. Switch as an Expression
 * No casting needed.
 */
public class SwitchDemo {
    void main() {
        Object obj = 10;

        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            default -> "Unknown type";
        };

        System.out.println(result);
    }
}
