package lesson4.Homework4;

import java.util.Scanner;

public class Homework4_3ab_CelsiusToFarenheit {
    public static void main(String[] args) {
        System.out.println("Enter temperature in Celsius degrees: ");
        Scanner scanner = new Scanner(System.in);
        double temperatureInCelsius = scanner.nextDouble();
        double temperatureInFarenheit = (temperatureInCelsius * 9 / 5) + 32;

        System.out.println(temperatureInCelsius + "C = " + temperatureInFarenheit + "F");
    }
}
