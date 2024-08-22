package org.example;

import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side: ");
        double side = Double.parseDouble(scanner.nextLine());

        // Correct formula for the area of a hexagon
        double area = (3 * Math.sqrt(3) * (side * side)) / 2;

        System.out.println("The area of the hexagon is: " + area);
    }
}
