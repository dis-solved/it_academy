package lesson16;

import java.util.LinkedList;
import java.util.Queue;

/**
 * FIFO - first in first out
 *
 * offer - adds element to the tail of the queue
 * poll - gets and removes from the head
 * peek - gets element from head > like contains, but returns element, not boolean
 *
 * add - adds element to the tail of the queue or throws exception
 * remove - gets and removes from the head or throw exception
 * element - gets element from head > like contains, but returns element, not boolean, or throw exception
 *
 */

public class QueueApp {
    public static void main(String[] args) {
        Queue queue = new LinkedList();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue);

        System.out.println("poll: " + queue.poll());
        System.out.println(queue);

        System.out.println("remove: " + queue.remove());
        System.out.println(queue);

        System.out.println("peek: " + queue.peek());
        System.out.println(queue);

        queue.offer(5);

        System.out.println("element: " + queue.element());
        System.out.println(queue);
    }
}
