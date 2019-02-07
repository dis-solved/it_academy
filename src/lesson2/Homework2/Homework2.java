package lesson2.Homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main (String[] args){
        System.out.println("What is your age?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 65) {
            System.out.println("Your discount is 10%");
        } else if (age < 18) {
            System.out.println("Your discount is 25%");
        } else {
            System.out.println("Your discount is 5%");
        }
    }
}
