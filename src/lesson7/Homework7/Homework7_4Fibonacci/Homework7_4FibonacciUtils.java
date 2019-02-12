package lesson7.Homework7.Homework7_4Fibonacci;

public class Homework7_4FibonacciUtils {
    public static int caclFibonacci(int input){
        int f0 = 0;
        int f1 = 1;
        int fn = 0;

        if (input == 0) {
            fn = f0;
        } else if (input == 1) {
            fn = f1;
        } else if (input > 1) {
            for (int i = 2; i <= input; i++) {
                fn = f1 + f0;
                f0 = f1;
                f1 = fn;
            }
        }
        return fn;
    }
}
