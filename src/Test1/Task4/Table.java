package Test1.Task4;

public class Table {
    public Order[] orders;
    public int ordersNumber = 0;

    public Table(int numberOfOrders){
        this.orders = new Order[numberOfOrders];
    }

    public void addOrders(Order order){
        if (ordersNumber == 5){
            return;
        }
        orders[ordersNumber] = order;
        ordersNumber++;
    }

    public void printOrder(){
        System.out.println("Table: " + ordersNumber);

        for (int i = 0; i < ordersNumber; i++){
            Order order = orders[i];
            System.out.println("order: " + order.getDishName() + order.getNumberOfDishes());
        }
    }
    }

