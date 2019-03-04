package lesson13;

public class Alligator {
    static int teeth;
    double scaleToughness;

    public Alligator() {
        teeth++;
    }
    public void snap(int teeth) {
        System.out.print(teeth+" ");
        teeth--;                        // why it doesn't decrease the value? because it's not static method and void?
    }
    public static void main(String[] unused) {
        new Alligator().snap(teeth);
        new Alligator().snap(teeth);
    }
}