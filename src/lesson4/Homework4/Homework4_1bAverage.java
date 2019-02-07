package lesson4.Homework4;

import java.util.Scanner;

public class Homework4_1bAverage {
    public static void main(String[] args) {
        System.out.println("Enter 5 integer numbers, confirm each of them with enter. \nNumber 1:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Number 2:");
        int number2 = scanner.nextInt();
        System.out.println("Number 3:");
        int number3 = scanner.nextInt();
        System.out.println("Number 4:");
        int number4 = scanner.nextInt();
        System.out.println("Number 5:");
        int number5 = scanner.nextInt();
        double average = (number1 + number2 + number3 + number4 + number5)/5;

        System.out.println("The average of given numbers equals " + average);
    }
}
