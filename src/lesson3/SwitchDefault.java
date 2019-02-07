package lesson3;

import java.util.Scanner;

public class SwitchDefault {
    public static void main(String[] args) {
        System.out.println("Give any number: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i) {
            case 3:
            case 7:
                System.out.println("Hello");
                break;
            case 10:
                System.out.println("case 10");
            default:
                System.out.println("sth default");

        }
        System.out.println("End");
    }

}
