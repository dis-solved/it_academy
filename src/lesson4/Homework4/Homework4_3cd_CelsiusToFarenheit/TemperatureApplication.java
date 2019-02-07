package lesson4.Homework4.Homework4_3cd_CelsiusToFarenheit;

import java.util.Scanner;

public class TemperatureApplication {
    public static void main(String[] args) {
        System.out.println("Enter temperature in Celsius degrees: ");
        Scanner scanner = new Scanner(System.in);
        Temperature temperature = new Temperature(scanner.nextDouble());
        double temperatureInFarenheit = temperature.convertToFarenheit();

        System.out.println(temperature.temperatureInCelsius + "C = " + temperatureInFarenheit + "F");
    }
}
