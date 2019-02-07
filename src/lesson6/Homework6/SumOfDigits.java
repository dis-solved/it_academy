package lesson6.Homework6;

import java.util.Scanner;
import java.lang.Math;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter any integer number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int rest;
        int sum = 0;

        while (number != 0){
           rest = Math.abs(number) % 10;
           sum = sum + rest;
           number = number / 10;
        }
        System.out.println("The sum of digits is equal: " + sum);
    }
}