package lesson3;

import java.util.Scanner;

public class WhileContinue {
    public static void main(String[] args){
        System.out.println("Give any number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int number = 0;

        while (number < input) {
            number++;

            if (number % 3 == 0){
                continue;
            }
            System.out.println(number);
        }
    }

}
