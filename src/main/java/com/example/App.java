package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueExecution = true;

        while (continueExecution) {
            System.out.println("\nOperations Available:\n");
            System.out.println("1. Square root function");
            System.out.println("2. Factorial function");
            System.out.println("3. Natural logarithm");
            System.out.println("4. Power function\n");
            System.out.println("Choose an operation:");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double sqrtInput = scanner.nextDouble();
                    System.out.println("Square root: " + Operation.squareRoot(sqrtInput));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int factInput = scanner.nextInt();
                    System.out.println("Factorial: " + Operation.fact(factInput));
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double logInput = scanner.nextDouble();
                    System.out.println("Natural logarithm: " + Operation.naturalLog(logInput));
                    break;
                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Power: " + Operation.power(base, exponent));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("\nDo you want to continue? (yes/no)");
            String continueChoice = scanner.next();
            if (!continueChoice.equalsIgnoreCase("yes")) {
                continueExecution = false;
            }
        }

        System.out.println("Exiting program...");
        scanner.close();
    }
}
