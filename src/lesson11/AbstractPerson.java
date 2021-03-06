package lesson11;

public abstract class AbstractPerson {
    protected String lastName;

    public AbstractPerson(String lastName){
        this.lastName = lastName;
    }
    public abstract void printName();

    public void printLastName(){
        System.out.println(lastName);
    }

    public String getLastName() {
        return lastName;
    }
}
