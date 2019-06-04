package lesson20;

import lesson11.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Lambda expression consists of 3 parts:
 * 1) it should have return type and parameter from functional interface
 * 2) arrow ->
 * 3) body of the method which includes condition
 * <p>
 * e.g. Condition nameCondition = (Person p) -> {return Objects.equals(p.getFirstName(),name);
 * };
 *
 * USE Optional as return type when there is possibility to return null
 * DON'T use Optional as a field type
 *
 * Functional interface can only have one abstract method
 */


public class PersonService {
    private List<Person> persons = new ArrayList<>();



    public void addPerson(Person person) {
        persons.add(person);
    }

    public Optional<Person> getFirstJohn(){
        for (Person p: persons){
            if ("John".equals(p.getFirstName())){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    public Optional<Person> getFirstJohnByStream() {
        persons.stream()
                .peek(p -> System.out.println("peek: " + p))
                .filter(Person::isPersonAdult) // 1st category: intermidiate operations
                .map(p -> p.getFirstName()) // 1st category: intermidiate operations
                .forEach(System.out::println); //2nd category: terminal operations

        // 1st category: intermidiate operations
        // map, filter, flatMap, peek, ...
        //2nd category: terminal operations
        // count, forEach, collect, ...
        // it is not recommended to modify instances of classes inside lambda
        // terminal operation is required to invoke the stream, AND only ONE terminal operation is allowed to be invoked,
        // once one terminal operation is invoked on stream, it is considered to be closed
      persons.stream()
              .filter((Person p) -> "John".equals(p.getFirstName()))
              .findFirst();





        return Optional.empty();
    }
//    public List<Person> getAdults() {
//        Condition adultContidion = new AdultContition();
//        List<Person> result = getByCondition(adultContidion);
//
//        for (Person p : persons) {
//            if (p.getAge() >= 18) {
//                result.add(p);
//            }
//        }
//        return result;
//    }

    public List<Person> getAdults() {
            return getByCondition( p -> p.getAge() >= 18);
    }

//    public List<Person> isAdult(){
//        return getByCondition(this::isAdult);
//    }
    private boolean isAdult(Person p){
        return p.getAge() >= 18;
    }


    public List<Person> getPersonsBySurname(String surname) {
        Condition surnameCondition = p -> Objects.equals(p.getLastName(), surname);
        return getByCondition(surnameCondition);
    }

//    public List<Person> getPersonsByName(String name){
//        Condition nameCondition = new Condition() {  // this is annonymous class
//            @Override
//            public boolean test(Person p) {
//                return Objects.equals(p.getFirstName(),name);
//            }
//        };
//        return getByCondition(nameCondition);
//    }

    public List<Person> getPersonsByName(String name) {
        Condition nameCondition = p -> Objects.equals(p.getFirstName(), name);

        return getByCondition(nameCondition);
    }


    private List<Person> getByCondition(Condition condition) {
        List<Person> result = new ArrayList<>();
        for (Person p : persons) {
            if (condition.test(p)) {
                result.add(p);
            }

        }
        return result;
    }

    @FunctionalInterface
    public interface Condition {
        boolean test(Person p);
    }

    public static class AdultContition implements Condition {

        @Override
        public boolean test(Person p) {
            return p.getAge() >= 18;
        }
    }

    public class SurnameCondition implements Condition {
        private String surname;

        public SurnameCondition(String surname) {
            this.surname = surname;
        }

        @Override
        public boolean test(Person p) {
            return Objects.equals(p.getLastName(), surname);
        }
    }
}
