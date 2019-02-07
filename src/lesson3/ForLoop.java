package lesson3;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Give any number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int number = 0; number < input; number++) {
            System.out.println(number);
        }
    }
}
