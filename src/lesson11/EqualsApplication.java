package lesson11;

import java.util.Objects;

public class EqualsApplication {
    public static void main(String[] args) {
        Person p1 = new Person("Steven","Grey");
        Person p2 = new Person("Steven","Grey");
        Person p3 = p2;

        if (p1 == p2){
            System.out.println("objects are the same");
        } else {
            System.out.println("objects are not the same");
        }

        if (p3 == p2){
            System.out.println("objects are the same");
        } else {
            System.out.println("objects are not the same");
        }

        boolean p1equalsP2 = p1.equals(p2); // by default this method compares references, so this wouldn't be equal
        if(p1equalsP2){
            System.out.println("objects are the same");
        } else {
            System.out.println("objects are not the same");
        }

        System.out.println( "p1 equals string: " + p1.equals("dskjkfhk"));


        System.out.println("Reflective");
        System.out.println(p1.equals(p1));

        System.out.println("Transitive");
        boolean p1Ep2 = p1.equals(p2);
        boolean p2Ep3 = p2.equals(p3);
        System.out.println(p1.equals(p3));

        System.out.println("Symmetric: ");
        boolean p1Ep2_ = p1.equals(p2);
        boolean p1Ep2fromObjects = Objects.equals(p1,p2); // all classes extend objects after java 1.6
        boolean p2Ep1_ = p2.equals(p1);
        System.out.println(p2Ep1_);

        System.out.println("Consistent: ");
        System.out.println("invokation 1: " + p1.equals(p2));
        System.out.println("invokation 2: " + p1.equals(p2));
        System.out.println("invokation 3: " + p1.equals(p2));
        p2.setAge(35);
        System.out.println("invokation 4: " + p1.equals(p2)); // age changed, so it'll return false

        System.out.println("null-safe: ");
        System.out.println(p1.equals(null));

        p1 = null; // nullpointer exception - objects cannot be equal to null because methods will not work - they are designed to work for SOME value, not nothing
        p1.equals(null);

    }
}
