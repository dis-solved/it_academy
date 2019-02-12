package lesson7.Homework7.Homework7_3Factorial;

public class Homework7_3FactorialUtils {
    public static int calculateFactorial(int input) {
        int factorial = 1;

        for (int i = 1; i < input; i++) {
            factorial = factorial * (i + 1);
        }
        return factorial;
    }
}
