package lesson7.Homework7.Homework7_2QuadraticEquations;

import java.util.Scanner;

public class Homework7_2QuadraticEquationsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0\nEnter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        Homework7_2Utils.calcX(a,b,c);
    }
}