package lesson2;

public class HelloWorld {
    public static void main(String[] args){
        float numberOfCookiesEaten = 3.5f;
        long numberOfWorries = 19888887777l;
        char letterC = 'C';
        char hexa = '\u0023';

        int age = 20;
        int older = age++;
        int younger = age++ -1;

        System.out.println(numberOfCookiesEaten);
        System.out.println(numberOfWorries);
        System.out.println(letterC);
        System.out.println(hexa);
        System.out.println("Hello World!");
        System.out.println(age);
        System.out.println(older);
        System.out.println(younger);
    }
}
