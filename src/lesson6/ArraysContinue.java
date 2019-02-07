package lesson6;

public class ArraysContinue {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        int [] alternative = new int[] {1,2,3};

        // for-each
        for (int someVar : numbers){
            System.out.println(someVar);
            if (someVar == 1){
                break;
            }

        }
    }
}
