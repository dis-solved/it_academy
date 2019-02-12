package lesson7.Homework7.Homework7_3Factorial;

import java.util.Scanner;

public class Homework7_3FactorialApp {
    public static void main(String[] args) {
        System.out.println("Enter any positive integer number to calculate its factorial:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int factorial = Homework7_3FactorialUtils.calculateFactorial(input);

        System.out.println(input + "! = " + factorial);
    }
}
