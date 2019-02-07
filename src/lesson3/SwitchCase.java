package lesson3;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Give any number: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i) {
            case 3:
                System.out.println("Case 3");
                break; // if we don't use break here, the next line is also executed
            case 7:
                System.out.println("case 7");
                break;
        }
        System.out.println("End");
    }
}
