package lesson7.Homework7.Homework7_4Fibonacci;

import java.util.Scanner;

public class Homework7_4FibonacciApp {
    public static void main(String[] args) {
        System.out.println("Enter any natural integer number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int fibonacci = Homework7_4FibonacciUtils.caclFibonacci(input);

        if (input < 0){
            System.out.println("Invalid input number");
        }else {
            System.out.println("F(" + input + ") = " + fibonacci);
        }
    }
}