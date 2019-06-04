package lesson4.Homework4.Homework4_4CircleLenght;

public class Circle {
    double radius;

    Circle(double r){
        radius = r;
    }

    public double calculateLenght(){
        double lenght = 2 * 3.1415 * radius;
        return lenght;
    }
}