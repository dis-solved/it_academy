package lesson18maps;

/**
 * Hashmap (Array of buckets, which are filled with linkedList) hashcode and equals methods are important to be correctly implemented(default capacity: 16, loadFactor: 0.75)
 * this means that capacity will be doubled once the load factor is reached
 * Enum Map - uses enums as keys
 * Treemap should be used when you need ordering of keys
 *
 * in Maps we cannot have two values for the same key - if we put another value with the same key, it will be overridden
 */

import lesson11.Person;
import lesson16.Fruit;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsApp {
    public static void main(String[] args) {
//        Map<Integer, Person> participants = new TreeMap<Integer, Person>(Comparator.<Integer>naturalOrder().reversed());
        Map<Fruit, Person> participants = new TreeMap<>();

        participants.put(new Fruit("apple"),new Person("John","Smith"));
        participants.put(new Fruit("orange"),new Person("Jane","Smith"));
        participants.put(new Fruit("banana"),new Person("Jessica","Fake"));
        participants.put(new Fruit("peach"),new Person("Kate","Blake"));

        System.out.println(participants);

        Person person3 = participants.get(new Fruit("banana"));
        System.out.println(person3);

    }
}
