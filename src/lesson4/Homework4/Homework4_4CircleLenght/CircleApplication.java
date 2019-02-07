package lesson4.Homework4.Homework4_4CircleLenght;

import java.util.Scanner;

public class CircleApplication {
    public static void main(String[] args) {
        System.out.println("Enter length of radius: ");
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle(scanner.nextDouble());
        double circleLength = circle.calculateLenght();

        System.out.println("Length of the circle with given radius equals: " + circleLength);
    }
}
