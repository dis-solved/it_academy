package Test1.Task4;

public class RestaurantApp {
    public static void main(String[] args) {
        Table table1 = new Table(1);
        Order order1 = new Order("Pomidorowa",3);
        table1.addOrders(order1);

        table1.printOrder();

    }
}
