package lesson7;

public class ReferenceTypes {
    public static void main(String[] args) {

        char a = 'a';
        char A = 64;
        char someChar = '\u00C7';

        System.out.println(A);
        System.out.println(someChar);

        boolean isAgreaterThana = A > a;
        System.out.println("A is greater than a: " + isAgreaterThana);
        int difference = A - a;

        System.out.println(difference);
        int aInt = a;


        // no interesting methods for boolean

        Character characterA = A;
        char lowercaseA = Character.toLowerCase(A);

        byte b = 10;
        Byte bClass = b;
        // null cannot be assigned to primitive types
        byte b2 = bClass;

//        byte b1 = Byte.parseByte(14);


        Integer integer = 10;
        String binaryString = Integer.toString(10, 2);
        System.out.println(binaryString);

        int comparisonResult = bClass.compareTo((byte)12);
        System.out.println(comparisonResult);
    }
}
