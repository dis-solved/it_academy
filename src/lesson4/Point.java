package lesson4;

//    Methods:
//    modifiers return_type name (parameter list) exceptions {
//    body
//    }
//    return_type = primitive, reference type, void
//    name of the method should have verb semantic
// method_name + (parameter list) - it is called signature



public class Point {
    public int x; // variables that belong to a class are called field
    public int y;
    public Point point; // by default the value of field  = null - this does not apply to local variable

    public Point(){

    }

    public Point(int xCoordinate, int yCoordinate){
        x = xCoordinate;
        y = yCoordinate;
    }

    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int newX, int newY){

        if (newX < 0){
            System.out.println("X is negative");
            return; // tego nie rozumiem
        }
        x = newX;
        y = newY;
    }
}
