package lesson10;

public class PersonApp {
    public static void main(String[] args) {
        AbstractPerson abstractPerson = new Person("Paul","Smith");
        abstractPerson.printName();


        Person john = new Person("John","Smith",25);
        Person anotherJohn = john;
        printFullName(anotherJohn);

        printFullName(john);



        Person p1 = new Client("Stefan", "Burns");
        Person p2 = new Employee("employee", "surname"); // employee cannot be cast to client
        printFullName(p1);
        printFullName(p2);

        Client c1 = (Client) p1; // you must cast here, otherwise it will not compile, cause not every person is a client
        Client client1 = new Client("Steven", "Grey", 28);
        Person person1 = client1;
        p2.printFullName("Hi!");

        System.out.println(client1.getDiscount());
        printFullName(p1);
        printFullName((Person) client1); // you can cast yourself tClient to Person
    }
//  method overloading: methods with the same name, but different parameters - decision on which method will
//  be run is done on compile time, based on which parameter was passed
    private static void printFullName (Person person){
        System.out.println("printing person info");
        person.printFullName();
    }

    private static void printFullName(Client client){
        System.out.println("printing client info");
        client.printFullName();
    }

}
