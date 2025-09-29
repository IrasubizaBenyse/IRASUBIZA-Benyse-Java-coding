package com.circle;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cont;

        do {
            System.out.println("\nYou selected Square");
            System.out.println("What would you like to calculate?");
            System.out.println("A. Area");
            System.out.println("B. Perimeter");
            char calc = sc.next().toUpperCase().charAt(0);

            System.out.print("Enter side: ");
            double s = sc.nextDouble();

            if (calc == 'A') {
                System.out.println("Area: " + (s * s));
            } else {
                System.out.println("Perimeter: " + (4 * s));
            }

            System.out.print("\nWould you like to continue? (Yes/No): ");
            cont = sc.next();
        } while (cont.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using system");
        sc.close();
    }
}
