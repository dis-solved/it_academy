package lesson20;

import lesson11.AbstractPerson;
import lesson11.Client;
import lesson11.Employee;
import lesson11.Person;

import java.util.*;
import java.util.function.Consumer;

public class Java8App {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
//        PersonService.SurnameCondition instanceOfInnerClass = personService.new PersonService.SurnameCondition("asd");
        // this is how you instantiate non-static inner class

        PersonService.AdultContition instanceOfStaticInnerClass = new PersonService.AdultContition();
        // this is how you instantiate static inner class

        Optional<Person> firstJohnByStreams = personService.getFirstJohnByStream();
        firstJohnByStreams.ifPresent(System.out::println);

        Person p1 = new Person("Stefan", "Burns",15);
        Person p2 = new Person("Paul", "Smith",35);
        Person p3 = new Person("John", "Doe",25);
        Person p4 = new Person("John", "Burns",45);

        System.out.println("### streams");
        personService.getFirstJohnByStream();
        System.out.println("### streams end");


        personService.addPerson(p1);
        personService.addPerson(p2);
        personService.addPerson(p4);
        personService.addPerson(p3);

        System.out.println(personService.getAdults());
        System.out.println(personService.getPersonsBySurname("Burns"));
        System.out.println(personService.getPersonsByName("John"));

        personService.getFirstJohn()
                .filter(Person::isPersonAdult)
                .map(AbstractPerson::getLastName)
                .ifPresent(lastName -> System.out.println("Adult John's last name is " + lastName));

//        OptionalDouble;  - those are designed to be used with primitive data types
//        OptionalLong;
//        OptionalInt;

        int i = 0;
        OptionalInt optionalInt = OptionalInt.of(i);


//        Person firstJohn = personService.getFirstJohn();

//        Optional<Person> optionalPerson = personService.getFirstJohn();
//
//        optionalPerson.ifPresent(person -> System.out.println(person.getLastName()));
//
//        optionalPerson.filter(p -> p.isPersonAdult());

//        if (firstJohn != null){
//
//            String lastName = firstJohn.getLastName();
//            System.out.println(lastName);
//        } else {
//            System.out.println("We don't have John");
//        }

    }
}
