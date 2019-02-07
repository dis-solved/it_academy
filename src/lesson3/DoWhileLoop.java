package lesson3;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Give any number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int number = 0;

        do {
            System.out.println(number);
            number++;
        }
        while (number < input);
        }
}
