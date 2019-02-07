package lesson5.Homework5.Homework5_2ArraysMinMax;

public class ArrayUtils {

    public static int max(int[] numbers){
        int maximum = numbers[0];
       for (int i = 0; i < numbers.length; i++){
          if (maximum < numbers[i]){
              maximum = numbers[i];
          }
       }
        return maximum;
    }

    public static int min(int[] numbers){
        int minimum = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (minimum > numbers[i]){
                minimum = numbers[i];
            }
        }
        return minimum;
    }
}
