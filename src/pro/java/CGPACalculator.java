package pro.java;

import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of semesters: ");
        int numSemesters = scanner.nextInt();

        double[] sgpa = new double[numSemesters];

        for (int i = 0; i < numSemesters; i++) {
            System.out.printf("Enter SGPA for Semester %d: ", i + 1);
            sgpa[i] = scanner.nextDouble();
        }

        double cgpa = 0.0;
        for (int i = 0; i < numSemesters; i++) {
            cgpa += sgpa[i];
        }
        cgpa /= numSemesters;

        double percentage = cgpa * 9.5;

        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.printf("Percentage: %.2f\n", percentage);
    }
}



