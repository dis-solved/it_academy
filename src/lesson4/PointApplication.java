package lesson4;

public class PointApplication {
    public static void main(String[] args) {
        Point point1 = new Point(1,1);
        Point point2 = new Point(10,3);

//        int x = point1.getX();
//        System.out.println(x);
//
//        point1.move(3,1);
//        x = point1.getX();
//        System.out.println(x);

        Rectangle rectangle = new Rectangle(point1,point2);
        int area = rectangle.calculateArea();
        System.out.println("The area of the rectangle equals " + area);
    }
}
