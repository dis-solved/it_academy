package Test1.Task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[] array = {"a","b"};

        for (int i = 0; i < array.length; i++){
            if (i == array.length - 1){
                System.out.print(array[i] = array[i].concat(", " + array[i]));
            } else
            System.out.print(array[i] = array[i].concat(", " + array[i]+ ", "));
        }
    }
}
