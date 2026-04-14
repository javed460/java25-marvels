package com.examples;

/**
 * Compact Source Files & Instance Main Methods (JEP 512)
 * Designed to make Java feel more like a scripting language,
 * this feature removes the "boilerplate" required to run a simple program.
 * You no longer need public static void main(String[] args)
 * or even a surrounding class for simple scripts.
 */
public class SimplifiedMain {
    void main() {
        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            IO.println("i = " + i);
        }
    }
}
