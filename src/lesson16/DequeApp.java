package lesson16;

import java.util.ArrayDeque;
import java.util.Deque;
/**
 * push - adds element to the head
 * pop returns element from the head and removes it

 */

public class DequeApp {
    public static void main(String[] args) {
        //Stack - LIFO data structure - last in first out

        Deque deque = new ArrayDeque();
        deque.push(1);
        deque.push(2);
        deque.push(3);

        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque);
    }
}
