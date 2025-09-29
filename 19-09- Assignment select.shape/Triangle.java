package com.circle;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cont;

        do {
            System.out.println("\nYou selected Triangle");
            System.out.println("What would you like to calculate?");
            System.out.println("A. Area");
            System.out.println("B. Perimeter");
            char calc = sc.next().toUpperCase().charAt(0);

            if (calc == 'A') {
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                System.out.println("Area: " + (0.5 * base * height));
            } else {
                System.out.print("Enter side a: ");
                double a = sc.nextDouble();
                System.out.print("Enter side b: ");
                double b = sc.nextDouble();
                System.out.print("Enter side c: ");
                double c = sc.nextDouble();
                System.out.println("Perimeter: " + (a + b + c));
            }

            System.out.print("\nWould you like to continue? (Yes/No): ");
            cont = sc.next();
        } while (cont.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using system");
        sc.close();
    }
}
