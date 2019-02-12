package lesson7;

public class ArrayUtils {

    public static void sort(int[] arr){
        for (int i = 0; i <arr.length; i++){
            System.out.println(i + ": " + arr[i]);
        }
        //selection sort
        //external loop
        for (int i = 0; i < arr.length; i++){
            int min = i;

            // internal loop
            for (int j = i; j < arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr [i] = temp;
            }
        }

        System.out.println("After sort: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(i + ": " + arr[i]);
        }
    }
}
