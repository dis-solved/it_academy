package lesson3;

import java.util.Scanner;

public class DoWhileLoopContinue {
    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int number = 0;

        do {
            number++;
            if (number % 3 == 0){
                continue;
            }
            System.out.println(number);
        } while (number < input);
    }
}
