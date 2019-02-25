package lesson11;

public class Client extends Person {

    public Client(String firstName, String lastName){
        super(firstName,lastName);
        System.out.println("Client: 2 param");
    }
    public Client(String firstName, String lastName, int age){
        super(firstName,lastName, age);
        System.out.println("Client: 3 param");
    }

    public int getDiscount(){
        if (age > 60){
            return 15;
        } else if (age < 18){
            return 10;
        }
        return 5;
    }

    @Override
    public void printFullName() {
        System.out.println("running from client");
        System.out.println("Discount: " + this.getDiscount());
        super.printFullName();// you can only reference to methods of direct parents
    }
}
