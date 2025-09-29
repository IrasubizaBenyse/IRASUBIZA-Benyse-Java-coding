package com.circle;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cont;

        do {
            System.out.println("\nYou selected Circle");
            System.out.println("What would you like to calculate?");
            System.out.println("A. Area");
            System.out.println("B. Perimeter");
            char calc = sc.next().toUpperCase().charAt(0);

            System.out.print("Enter radius: ");
            double r = sc.nextDouble();

            if (calc == 'A') {
                System.out.println("Area: " + (Math.PI * r * r));
            } else {
                System.out.println("Perimeter: " + (2 * Math.PI * r));
            }

            System.out.print("\nWould you like to continue? (Yes/No): ");
            cont = sc.next();
        } while (cont.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using system");
        sc.close();
    }
}
