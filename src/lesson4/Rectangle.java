package lesson4;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;


    public Rectangle(Point bottomLeftPoint, Point topRightPoint){
        bottomLeft = bottomLeftPoint;
        topRight = topRightPoint;
    }

    public int calculateArea(){
        int width = topRight.getX() - bottomLeft.getX();
        int height = topRight.getY() - bottomLeft.getY();
        int area = width * height;
        return area;
    }
}
