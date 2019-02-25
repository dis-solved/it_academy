package lesson11.Homework11_5Vehicle;

public class VehicleStart {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();

        vehicle1.startEngine();
        vehicle2.startEngine();
        vehicle1.startEngine();
        vehicle1.startEngine();
        vehicle2.startEngine();
        vehicle2.startEngine();

        System.out.println("The vehicles were started " + Vehicle.counter + " time(s)");
    }
}
