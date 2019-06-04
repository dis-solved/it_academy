package lesson10.Shape;

import java.io.Serializable;

public class Circle extends Shape implements ShapeInterface, Serializable {
    private double r;

//    a class CAN extend only one other class, but it can implement MORE than one interfacees

    public Circle(double r){
        this.r = r;
    }

    public double calcArea() {
        return 3.14 * r * r;
    }
}
