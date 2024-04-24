package hust.soict.cybersec.lab01;

import java.util.Scanner;

public class LinearSystemSolver {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            double a1, b1, c1, a2, b2, c2;
            System.out.print("a1 = ");
            a1 = scanner.nextDouble();
            System.out.print("b1 = ");
            b1 = scanner.nextDouble();
            System.out.print("c1 = ");
            c1 = scanner.nextDouble();
            System.out.print("a2 = ");
            a2 = scanner.nextDouble();
            System.out.print("b2 = ");
            b2 = scanner.nextDouble();
            System.out.print("c2 = ");
            c2 = scanner.nextDouble();
            
            double aRatio = a1 / a2;
            double bRatio = b1 / b2;
            double cRatio = c1 / c2;

            if (aRatio == bRatio && aRatio != cRatio) {
                System.out.println("The given linear equation has no solution.");
            } else if (aRatio == bRatio && aRatio == cRatio) {
                System.out.println("The given linear equation has infinitely many solutions.");
            } else {
                double x1 = (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
                double x2 = (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);
                System.out.printf(x1, x2);
            }
        } catch (Exception e) {
            System.out.printf("Please provide valid values.");
        } finally {
            System.exit(0);
        }
    }
}