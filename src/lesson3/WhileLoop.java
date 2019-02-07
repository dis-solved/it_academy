package lesson3;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        System.out.println("Give any number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int number = 0;

        while (number < input) {
            System.out.println(number);
            number++;
        }
    }
}
