package vu.question1;

import java.util.Scanner;

public class LeapMonth {
    public static void main(String[] args) {
        // Variable to control whether the program should continue
        try ( // Create a Scanner object to read user input
                Scanner scanner = new Scanner(System.in)) {
            // Variable to control whether the program should continue
            boolean continueProgram = true;
            // Loop to continue the program until the user decides to exit
            while (continueProgram) {
                // Ask the user to enter the year
                System.out.print("Enter the year: ");
                int year = scanner.nextInt();
                
                // Ask the user to enter the month
                System.out.print("Enter the month (1 for January, 2 for February, etc.): ");
                int month = scanner.nextInt();
                
                // Determine if the month is February and the year is a leap year
                boolean isLeapMonth = (month == 2) && (year % 4 == 0);
                isLeapMonth = isLeapMonth && (year % 100 != 0);
                isLeapMonth = isLeapMonth || (year % 400 == 0);
                
                // Output the result to the user
                if (isLeapMonth) {
                    System.out.println("February " + year + " is a leap month.");
                } else {
                    System.out.println("Month " + month + " in the year " + year + " is not a leap month.");
                }
                
                // Print separator after output
                printSeparator();
                
                // Ask the user if they want to check another month
                System.out.print("Do you want to check another month? (yes/no): ");
                scanner.nextLine(); // Consume newline left-over
                String response = scanner.nextLine().trim().toLowerCase();
                
                // Check if the user wants to continue or exit the program
                if (!response.equals("yes")) {
                    continueProgram = false;
                } else {
                    // Print separator before next iteration
                    printSeparator();
                }
            }
            // Close the scanner to release resources
        }
    }

    // Method to print a separator
    private static void printSeparator() {
        System.out.println("----------------------------------------");
    }
}
