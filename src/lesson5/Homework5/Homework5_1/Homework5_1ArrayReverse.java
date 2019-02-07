package lesson5.Homework5.Homework5_1;

public class Homework5_1ArrayReverse {
    public static void main(String[] args) {
        int [] myArray = new int[5];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;
        }

        for (int i = myArray.length - 1; i >= 0; i--) {
            if (i > 0){
                System.out.print(myArray[i] + ", ");
            } else{
                System.out.print(myArray[i]);
            }
        }
    }
}
