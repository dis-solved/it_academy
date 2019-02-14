package lesson8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InOutBoxing {
    public static void main(String[] args) {
        int number = 10;
        Integer numberWrapper = number;
        System.out.println(numberWrapper.toString());

        Character charactcer = 'a';
        char upperCase = Character.toUpperCase(charactcer);
        System.out.println(upperCase);

        boolean digit = Character.isDigit(charactcer);
        System.out.println(digit);


        String someString = "my string here";
        System.out.println("Write number");
        String usingConstructor = new String("my string from constructor");

        someString.toUpperCase();
        System.out.println(someString); // Strings are immutable, this means you cannot change it -
        // you need to assign the above line to new String or reassign the new value to old String, like below

        someString = someString.toUpperCase();
        System.out.println(someString);

        int length = someString.length();
        System.out.println(length);

        char third = someString.charAt(3); // index starts from 0
        System.out.println(third);

        char[] chars = someString.toCharArray();
        chars[3] = 'Q';
        String str = new String(chars);

        System.out.println(str);

        String summedUp = someString + "end.";

        summedUp.substring(3,7); // 3 will be included, 7 excluded

        String formatted = String.format("You have %d grade", 5);
        System.out.println(formatted);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Beggining");
        int no = 5;
        if (no > 0){
            stringBuilder.append("number more than 0");
        }
        int no1 = 100_000_000;
        double doubleValue = 100_000_000.123;

        int[] numbers = new int[] {1,2,3,5};

        // 1 2 3
        // 4 5 6
        int [][] numbersTable = new int[2][];
        numbersTable[0] = new int[]{1, 2, 3};
        numbersTable[1]  = new int[]{4, 5, 6};

        //to access number 5
        int number1_2 = numbersTable[1][2];
        System.out.println(number1_2);
        // Inheritance + polimorphism next lesson

        System.out.println(someString);

        System.out.println(reverse(someString));
    }

    public static String reverse(String str){
        char[] chars = str.toCharArray();
        char[] tempCharArray = new char[chars.length];
        for (int j = 0; j < chars.length; j++){
            tempCharArray[j]= chars[chars.length - 1 - j];
        }
//        String reversed = Arrays.toString(tempCharArray); / cannot use that because it will return String in Array format [,]
        String reversed = new String(tempCharArray);
        return reversed;
    }
}