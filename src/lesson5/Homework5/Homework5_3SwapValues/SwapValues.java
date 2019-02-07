package lesson5.Homework5.Homework5_3SwapValues;

public class SwapValues {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        int temp = x;
        x = y;
        y = temp;

        System.out.println("Value of variable x: " + x + "Value of variable y: " + y);
    }
}
