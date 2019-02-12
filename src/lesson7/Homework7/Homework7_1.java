package lesson7.Homework7;

import java.util.Scanner;

public class Homework7_1 {
    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        int squarePower = 2;
        int cubePower = 3;
        int fourthPower = 4;

        double inputToSquare = Math.pow(input, squarePower);
        double inputToCube = Math.pow(input,cubePower);
        double inputToFourth = Math.pow(input,fourthPower);

        System.out.println("Square power: " + inputToSquare + "\nCube power: " + inputToCube + "\nFourth  power: " +
                inputToFourth);
    }
}
