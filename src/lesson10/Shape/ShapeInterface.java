package lesson10.Shape;

public interface ShapeInterface {
    double PI = 3.14;
//    by default any variable in i-f is static and final
    double calcArea(); // it is public and abstract by default, we cannot use private or protected

    default void printPi(){
        System.out.println(PI);
    }
    static void print(){


        //marker interfaces without any methods like Clonable, Serialazible
    }
}
