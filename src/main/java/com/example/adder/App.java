package com.example.adder;

/**
 * Hello world!
 *
 */

public class App {
    public static void main(String[] args) {
        // Convert command-line arguments (String) to integers
        int a = Integer.parseInt(args[0]);  
        int b = Integer.parseInt(args[1]);  

        // Print the sum
        System.out.println("Sum is: " + (a+b));
    }
}
