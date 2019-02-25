package lesson11;

import java.util.Objects;

public class Person extends AbstractPerson {

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

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName);
    }

    //    @Override
//    public boolean equals(Object object){
//        // 1. reflective: x.equals(x) should return true
//        // 2. transitive: x,y,z; if x.equals(y) and y.equals(z) => x.equals(z)
//        // 3. symmetric: if x.equals(y) => y.equals(x)
//        // 4. consistent: x.equals(y) forever unless sth will change
//        // 5. null-safe: you can pass null as the parameter and your method should not fail
//
//        if (this == object){
//            return true;
//
//        }
//
//        if (object == null){
//            return false;
//        }
//
//        Class thisClass = getClass();
//        Class thatClass = object.getClass();
//        if (!(thisClass.equals(thatClass))){  // this is not null-safe, so this is why we added above check
//            return false;
//        }
//
//
////        if (!(object instanceof Person)){ // it is not recomennded to use instanceof with equals
////            return false;
////        }
//        Person thatPerson = (Person) object;
//        if (thatPerson.firstName.equals(this.firstName)
//                && thatPerson.lastName.equals(lastName)
//                && thatPerson.age == this.age){
//            return true;
//        }
//        return false;
//    }
}