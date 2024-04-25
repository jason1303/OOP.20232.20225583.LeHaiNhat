package hust.soict.cybersec.lab01;

import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args) {
        

        try (Scanner scanner = new Scanner(System.in)) {
            double a, b;
            System.out.print("a = ");
            a = scanner.nextDouble();
            System.out.print("b = ");
            b = scanner.nextDouble();
            
            if (a != 0) {
                double result = -(b) / a;
                System.out.printf(result);
            } else {
                System.out.println("The equation does not have a solution");
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid value.");
        } finally {
            System.exit(0);
        }
    }
}