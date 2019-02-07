package lesson5;

import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        System.out.println("From how many integer numbers you would like to calculate average?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] numbers = new int[n]; // lenght of the array is fixed, cannot change it

        System.out.println("Enter your " + n + " numbers followed by enter");
        for (int i = 0; i < n; i++){
            int number = scanner.nextInt();
            numbers[i] = number;
        }
        double avg = calcAverage(numbers);
        System.out.println("The average of given numbers equals " + avg);
    }

    static double calcAverage (int[] numbers){
        double sum = 0;
        double n = numbers.length;
        for (int i = 0; i < n; i++){
            sum = sum + numbers[i];
        }

        double average = sum/n;
        return average;
    }
}