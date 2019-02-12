package lesson7.Homework7.Homework7_5ArrayMinMax;

public class Homework7_5ArrayUtils {
    public static char max(char[] array){
        Character maximum = array[0];
        for (int i = 0; i < array.length; i++){
            if (maximum.compareTo(array[i]) < 0){
                maximum = array[i];
            }
        }
        return maximum;
    }

    public static char min(char[] array){
        Character minimum = array[0];
        for (int i = 0; i < array.length; i++){
            if (minimum.compareTo(array[i]) > 0){
                minimum = array[i];
            }
        }
        return minimum;
    }
}