package src.JavaWeek11Programs;

import java.util.Scanner;

public class UltimateCom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            // Display menu
            displayMenu();

            // Get user's choice
            int choice = getUserChoice(scanner);

            // Call corresponding method based on user choice
            switch (choice) {
                case 1:
                    displayApp();
                    break;
                case 2:
                    textArtApp();
                    break;
                case 3:
                    calculatorApp();
                    break;
                case 4:
                    binaryCalculatorApp();
                    break;
                case 5:
                    encouragementApp();
                    break;
                case 6:
                    diceApp();
                    break;
                case 7:
                    oppishApp();
                    break;
                case 8:
                    fibonacciApp();
                    break;
                case 9:
                    doubleFactorialApp();
                    break;
                case 0:
                    continueProgram = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }

    // Method to display the menu options
    public static void displayMenu() {
        System.out.println("\nSelect an option:");
        System.out.println("1) Display APP (week #1)");
        System.out.println("2) Text Art APP (week #1)");
        System.out.println("3) Calculator APP (week #3)");
        System.out.println("4) Binary Calculator APP (week #3)");
        System.out.println("5) Encouragement APP (week #4)");
        System.out.println("6) Dice APP (week #5)");
        System.out.println("7) Oppish APP (week #6)");
        System.out.println("8) Fibonacci APP (week #7)");
        System.out.println("9) Double Factorial APP (week #11)");
        System.out.println("0) Exit");
    }

    // Method to get and validate the user's choice
    public static int getUserChoice(Scanner scanner) {
        int choice = -1;
        while (choice < 0 || choice > 9) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                scanner.next(); // Clear invalid input
                System.out.println("Invalid input. Please enter a number between 0 and 9.");
            }
        }
        return choice;
    }

    // Placeholder method for Display APP
    public static void displayApp() {
        System.out.println("Displaying APP... (functionality not implemented yet)");
    }

    // Placeholder method for Text Art APP
    public static void textArtApp() {
        System.out.println("Text Art APP... (functionality not implemented yet)");
    }

    // Placeholder method for Calculator APP
    public static void calculatorApp() {
        System.out.println("Calculator APP... (functionality not implemented yet)");
    }

    // Placeholder method for Binary Calculator APP
    public static void binaryCalculatorApp() {
        System.out.println("Binary Calculator APP... (functionality not implemented yet)");
    }

    // Placeholder method for Encouragement APP
    public static void encouragementApp() {
        System.out.println("Encouragement APP... (functionality not implemented yet)");
    }

    // Placeholder method for Dice APP
    public static void diceApp() {
        System.out.println("Dice APP... (functionality not implemented yet)");
    }

    // Placeholder method for Oppish APP
    public static void oppishApp() {
        System.out.println("Oppish APP... (functionality not implemented yet)");
    }

    // Placeholder method for Fibonacci APP
    public static void fibonacciApp() {
        System.out.println("Fibonacci APP... (functionality not implemented yet)");
    }

    // Placeholder method for Double Factorial APP
    public static void doubleFactorialApp() {
        System.out.println("Double Factorial APP... (functionality not implemented yet)");
    }
}
