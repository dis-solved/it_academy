package lesson10;

public class Person extends AbstractPerson{

//    if I declare a CLASS as FINAL it means that it cannot be inherited by other class classes methods and field no constructors;

//    does not apply to classes
//    access modifiers: incapsulation
//    public - least restrictive, allows access from everywhere
//    protected - for the same package and inheriting classes
//    default (absence of am)
//    private - most restrictive

    // inner classes + interfaces + polimorphism


    private String firstName; // for reference data types the default value is null
    protected int age;
    static int count = 0;
    private Address address; // this is composition relationship - a field of class of other type

    static {
        System.out.println("static instance variables initialization block" + count);
        //they don't have access to variables which are not static, they are invoked only one time
    }

    {
        System.out.println("instance variables initialization block");
        firstName = "empty";
        age = -1; // they are invoked with every instance creation
    }

    public Person(String firstName, String lastName){
        super(lastName);
        count++;
        System.out.println("2 param-constructor");
        this.firstName = firstName;
    }

    public Person (String firstName, String lastName, int age){
        this(firstName, lastName);
        System.out.println("3 param-constructor");
        this.age = age;
    }

    public void printFullName(){
        System.out.println(firstName + ", " + lastName);
    }
    public void printFullName(String greeting){
        System.out.println(greeting + " ");
        printFullName();
    }
    @Override
    public void printName(){
        System.out.println(firstName);
    }

}