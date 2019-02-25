package lesson11.Homework11_3Counter;

public class Counter {
    public static void main(String[] args) {
        int[] array = new int[]{1,5,3,6,23,54,3,6,7,4,4,8,9,3};
        int counter = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] > 3 && array[i] % 3 == 0){
                counter += 1;
            }
        }
        System.out.println(counter + " numbers from given array are both divisible by 3 and greater than 3");
    }
}
