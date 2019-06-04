package lesson11;

public class Exercises {
    public static void main(String[] args) {
        String name = "Kinga";
        String surname = "Kowalska";

        System.out.println(name.concat(" " + surname));

        char[] charArray = name.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i-- ){
            System.out.print(charArray[i]);
        }
    }
}