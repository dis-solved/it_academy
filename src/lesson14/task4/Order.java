package lesson14.task4;

public class Order {
    private String dish;
    private int numberOfDishes;

//    make fields private and if you want to modify or get the name, use public methods getters and setters

    public Order(String dish, int numberOfDishes){
        this.dish = dish;
        this.numberOfDishes = numberOfDishes;
    }

    public String getDish(){
        return dish;
    }

    @Override
    public String toString(){
        return dish + "(" + numberOfDishes + ")";
    }
}
