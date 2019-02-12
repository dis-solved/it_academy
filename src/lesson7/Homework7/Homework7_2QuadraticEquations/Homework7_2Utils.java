package lesson7.Homework7.Homework7_2QuadraticEquations;

public class Homework7_2Utils {
    public static void calcX(double a, double b, double c){
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double x1;
        double x2;

        if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println();
            System.out.println("\u0394 = " + discriminant + "\nx = " + x1 + "and x = " + x2);
        } else if (discriminant == 0) {
            x1 = -b / 2 * a;
            System.out.println("\u0394 = " + discriminant + "\nx = " + x1);
        } else {
            System.out.println("\u0394 = " + discriminant + "\nThis equation doesn't have solution");
        }
    }
}
