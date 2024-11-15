package src.JavaWeek11Programs;

import java.util.Scanner;

public class GPA {

    static double computeGPA(double[] grades, double[] credits) {
        double totalGradePoints = 0;
        double totalCredits = 0;
        
        for (int i = 0; i < grades.length; i++) {
            totalGradePoints += grades[i] * credits[i];  // Add grade points for the course
            totalCredits += credits[i];  // Add credits for the course
        }
        
        // Calculate and return GPA
        return totalGradePoints / totalCredits;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask how many courses the user has taken
        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        // Declare arrays to store grades and credits
        double[] grades = new double[numCourses];
        double[] credits = new double[numCourses];

        // Get the grades and credits for each course
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter grade for course " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            
            System.out.print("Enter number of credits for course " + (i + 1) + ": ");
            credits[i] = scanner.nextDouble();
        }

        // Compute GPA using the computeGPA method
        double gpa = computeGPA(grades, credits);

        // Output the GPA
        System.out.printf("Your GPA is: %.2f\n", gpa);

        scanner.close();
    }
}
