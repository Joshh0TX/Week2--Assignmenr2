package org.example;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Reverse the string
        String reversedString = new StringBuilder(inputString).reverse().toString();

        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);
    }
}

