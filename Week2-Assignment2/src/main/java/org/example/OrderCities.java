package org.example;

import java.util.Scanner;
import java.util.Arrays;

public class OrderCities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three cities
        System.out.println("Enter the first city: ");
        String city1 = scanner.nextLine();

        System.out.println("Enter the second city: ");
        String city2 = scanner.nextLine();

        System.out.println("Enter the third city: ");
        String city3 = scanner.nextLine();

        // Store cities in an array
        String[] cities = {city1, city2, city3};

        // Sort the array in ascending order
        Arrays.sort(cities);

        // Display the cities in ascending order
        System.out.println("Cities in ascending order: ");
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities);
        }
    }
}
