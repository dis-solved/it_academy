package lesson9;

import lesson9.people.Client;
import lesson9.people.Person;

public class PersonApp {
    public static void main(String[] args) {
        Person john = new Person("John","Smith",25);
        Person anotherJohn = john;
        printFullName(anotherJohn);

        printFullName(john);

        Client client1 = new Client("Steven", "Grey", 28);

        System.out.println(client1.getDiscount());
        client1.printFullName();
    }

    private static void printFullName (Person person){
        person.printFullName();
    }

    private static void printFullName(Client p){
        p.printFullName();
    }
}
