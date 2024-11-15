package src.JavaWeek11Programs;

import java.util.Scanner;

public class DoubleFactorial {

    // Main method to handle user input and call the double factorial function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        // Loop to keep the program running until the user decides to stop
        while (continueRunning) {
            // Get and validate user input
            int number = getUserInput(scanner);

            // Compute and print the double factorial
            if (number >= 1 && number < 20) {
                System.out.println("The double factorial of " + number + "!! is: " + doubleFactorial(number));
            } else {
                System.out.println("Input is out of valid range. Please enter a positive integer less than 20.");
            }

            // Ask user if they want to run the program again
            System.out.print("Do you want to calculate another double factorial? (y/n): ");
            String userChoice = scanner.next();

            // If user enters "n", stop the loop and end the program
            if (userChoice.equalsIgnoreCase("n")) {
                continueRunning = false;
                System.out.println("Goodbye!");
            }
        }

        scanner.close();
    }

    // Recursive method to compute the double factorial
    public static int doubleFactorial(int n) {
        if (n == 1 || n == 2) {  
            return n;
        } else {
            return n * doubleFactorial(n - 2); 
        }
    }

    // Method to get and validate the user input
    public static int getUserInput(Scanner scanner) {
        int number = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a positive integer less than 20: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0 && number < 20) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a number greater than 0 and less than 20.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
            }
        }

        return number;
    }
}
