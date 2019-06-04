package lesson14.homework14;

public class ParkingApp {
    public static void main(String[] args) {
        Parking parking = new Parking(10,10);
        Vehicle mazda6 = new Vehicle("DW6U995");

        try {
//            for (int i = 0; i < 101; i++){
//                parking.parkVehicle(mazda6);
//            }
 Ticket ticket1 = new Ticket("DWeee",0, 3);

            Ticket ticket = parking.parkVehicle(mazda6);

            System.out.println(ticket);

            System.out.println(parking.getAvailableSlots());

            Vehicle vehicle = parking.getVehicle(ticket1);
            System.out.println("Vehicle from parking: " + vehicle);

        } catch (NoParkingSlotsException ex) {
            System.out.println("Sorry, no available slots for the moment!");
        } catch (TicketInvalidException e) {
            System.out.println("Sorry, your ticket is invalid!");
        }
        System.out.println(parking.getAvailableSlots());
    }
}
