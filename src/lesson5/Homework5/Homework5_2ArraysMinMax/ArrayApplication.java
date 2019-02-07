package lesson5.Homework5.Homework5_2ArraysMinMax;

public class ArrayApplication {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 100;
        myArray[1] = 50;
        myArray[2] = 1000;
        myArray[3] = 75;
        myArray[4] = 10;

        int maximum = ArrayUtils.max(myArray);
        int minimum = ArrayUtils.min(myArray);

        System.out.println("Maximum number is " + maximum);
        System.out.println("Minimum number is " + minimum);
    }
}
