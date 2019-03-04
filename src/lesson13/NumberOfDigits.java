package lesson13;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println("Number of digits: " + numberOfDigits(input));
    }

    public static int numberOfDigits(int number){
        String temp = String.valueOf(Math.abs(number));
        return temp.length();
    }
}