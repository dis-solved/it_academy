package lesson16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListApp {
    public static void main(String[] args) {
        List list = new ArrayList();
//        ArrayList list = new ArrayList(100);


        System.out.println(list.size());

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(11);


        System.out.println(list.size());
        System.out.println(list);

        Object element3 = list.get(3); //        int element3 = (int)list.get(3); - you can cast it to int

        System.out.println(element3);

        System.out.println("removing");
        System.out.println(list.remove(3));
        System.out.println(list);
        System.out.println(list.remove((Integer)5)); //returns boolean if operation was successful or not
        System.out.println(list.remove((Integer)15));
        System.out.println(list);

    }
}
