package Test1.Task4;

public class Order {
    public String dishName;
    public int numberOfDishes;

    public Order(String dishName, int numberOfDishes){
        this.dishName = dishName;
        this.numberOfDishes = numberOfDishes;
    }

    public String getDishName(){
        return dishName;
    }

    public int getNumberOfDishes() {
        return numberOfDishes;
    }
}
