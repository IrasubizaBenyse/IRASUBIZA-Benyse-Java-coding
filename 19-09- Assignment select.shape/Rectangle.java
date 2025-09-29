package com.circle;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cont;

        do {
            System.out.println("\nYou selected Rectangle");
            System.out.println("What would you like to calculate?");
            System.out.println("A. Area");
            System.out.println("B. Perimeter");
            char calc = sc.next().toUpperCase().charAt(0);

            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter width: ");
            double w = sc.nextDouble();

            if (calc == 'A') {
                System.out.println("Area: " + (l * w));
            } else {
                System.out.println("Perimeter: " + (2 * (l + w)));
            }

            System.out.print("\nWould you like to continue? (Yes/No): ");
            cont = sc.next();
        } while (cont.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using system");
        sc.close();
    }
}
