package lesson4.Homework4;

import java.util.Scanner;

public class Homework4_2 {
    public static void main(String[] args) {
        System.out.println("Enter any integer number and confirm with enter:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input % 23 == 0){
            System.out.println("Given number is divisible by 23");
        } else {
            System.out.println("Given number is not divisible by 23");
        }
    }
}
