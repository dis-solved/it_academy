package lesson7.Homework7.Homework7_5ArrayMinMax;

public class Homework7_5ArrayApp {
    public static void main(String[] args) {
        char[] myArray = new char[]{'a','z','b','f','g','h','p'};
        char maximum = Homework7_5ArrayUtils.max(myArray);
        char minimum = Homework7_5ArrayUtils.min(myArray);

        System.out.println("The lowest character is " + maximum);
        System.out.println("The highest character is " + minimum);
    }
}
