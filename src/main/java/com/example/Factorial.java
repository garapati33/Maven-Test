package com.example;

public class Factorial {
    // Recursive function to calculate factorial
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // random number
        int number = 6; // Change this to the number whose factorial you want to calculate
        int result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
