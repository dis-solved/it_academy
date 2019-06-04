package lesson14.exception;

public class ExceptionsApp {
    public static void main(String[] args) {

        int a = 0; //(make it input by scanner)
        System.out.println(doubleNumber(6));
        try {
            System.out.println(doubleNumber(a));
        } catch (ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        } finally {

        }
        System.out.println(doubleNumber(0));

    }

    public static int doubleNumber(int a) throws ArithmeticException, NullPointerException{
        if (a == 0){
            throw new NullPointerException("number is equal to zero");
        }
        if (a < 0){
            throw new ArithmeticException("number is negative");
        }
        return 2 * a;
    }
}
