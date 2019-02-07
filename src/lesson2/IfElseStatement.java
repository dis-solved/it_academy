package lesson2;

public class IfElseStatement {
    public static void main(String[] args){
        boolean inWroclaw = false;
        if (inWroclaw){
            System.out.println("You are in Wroclaw");
        }
        else {                                          //this part is optional, if you want to do sth in case of false
            System.out.println("You are in Warsaw");
        }

        inWroclaw = true;

        if (inWroclaw)
            System.out.println("WRO");
        else
            System.out.println("WAW");

        int age = 20;
        if (age > 20)
            System.out.println("You are old bastard!");
        else
            System.out.println("You are young bastard!");
    }
}
