package lesson7;

import java.util.Arrays;

public class SortApp {
    public static void main(String[] args) {
        int[] myArray = new int[] {1,2,3,5,8};

        int [] j = Arrays.copyOf(myArray,3);

        ArrayUtils.sort(myArray);

        // this works only with sorted arrays - returns the index of the element in array
        int i = Arrays.binarySearch(myArray, 8);
        System.out.println(i);
    }
}
