package Test1.Task1;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1,3,5,6,7,9,6,77,17,89,8};
        int even = 0;
        int odd = array.length - even;

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) {
                even+= 1;
            }
        }

        System.out.println("There are " + even + " even and " + odd + " odd numbers in the array");
    }
}
