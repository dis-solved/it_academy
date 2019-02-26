package Test1.Task3;

public class Task3 {
    public static int counter = 0;

    public Task3(){
        counter++;
    }

    public static int getInstanceNumber() {
        return counter;
    }
}
