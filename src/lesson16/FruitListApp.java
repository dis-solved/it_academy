package lesson16;
/**
 * By default add ads the element as last to linked list, but you can also use addFirst/addLast methods (but they will
 * not work with ArrayList)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FruitListApp {
    public static void main(String[] args) {
        List fruits = new LinkedList();
//        fruits.add(5);
        fruits.add(new Fruit("orange"));
        fruits.add(new Fruit("apple"));
        fruits.add(new Fruit("banana"));
        fruits.add(new Fruit("peach"));
        ((LinkedList) fruits).addFirst(new Fruit("blueberries"));
        System.out.println(fruits);
        Collections.sort(fruits);
        Collections.reverse(fruits);

        System.out.println(fruits);
        System.out.println("contains apple: " + containsApple(fruits));
        System.out.println("first fruit: " + getFirst(fruits));
    }

    private static boolean containsApple(List fruits){
        return fruits.contains(new Fruit("apple"));
    }

    private static Fruit getFirst(List fruits){
        Fruit fruit = (Fruit) fruits.get(0);
        return fruit;
    }
}
