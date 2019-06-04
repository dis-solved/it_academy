package lesson14.task4;

import lesson11.Client;
import lesson11.Person;

import java.util.Objects;

public class RestaurantApp {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Order order1 = new Order("potato",1);
        Order order2 = new Order("potato", 2);

        Objects.isNull(order1);


        Table table1 = new Table(new Order[] {order1,order2});
        try {
            restaurant.addTableOrder(table1,7); // this is changed, number of tables restricted to 5
        } catch (RestaurantBusyException e){
            System.out.println("Sorry, Restaurant is busy");
        } catch (RestaurantException e) {
            System.out.println("Exception occured: " + e.getMessage());
        }

        restaurant.printTables();

        //equals
        //hashcode - implemented every time with equals
        //toString

//        those methods are automatically generated to every class that has some fields

        boolean b = order1 == order2;
        System.out.println("Orders equal by ==" + b);

        if (order1.equals(order2)){
            System.out.println("equal orders");
        } else {
            System.out.println("different orders");
        }

        System.out.println("Order 1: " + order1);
        System.out.println("Order 1: " + order1.toString()); // the same what above, but automatically happens by java

        Class aClass = table1.getClass();
        System.out.println(aClass);

        Person p1 = new Person("Jane", "Doe");
        Person p2 = new Client("Client","G",32);

        if (p1 instanceof Client){
            System.out.println("p1 is client");
        }else {
            System.out.println("p1 is not client");
        }

    }
}
