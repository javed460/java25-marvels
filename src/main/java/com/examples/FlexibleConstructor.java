package com.examples;

/**
 * Flexible Constructor Bodies (JEP 513). Before Java 25, super() or this()
 * had to be the very first statement in a constructor. Now, you can perform
 * logic (like validation or calculation) before calling the parent constructor,
 * as long as you don't access this.
 */
public class FlexibleConstructor {

    private final String email;

    public FlexibleConstructor(String email) {
        // NEW: Logic BEFORE super()!
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        super(); // Now explicit or implicit after the check
        this.email = email;
    }
}
