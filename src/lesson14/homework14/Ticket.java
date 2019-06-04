package lesson14.homework14;

public class Ticket {
    private final String vehicleRegistrationNumber;
    private final int rowNumber;
    private final int slotNumber;

    public Ticket(String vehicleRegistrationNumber, int rowNumber, int slotNumber){
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
        this.rowNumber = rowNumber;
        this.slotNumber = slotNumber;
    }

    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    public int getRow() {
        return rowNumber;
    }


    public int getSlot() {
        return slotNumber;
    }

    @Override
    public String toString() {
        return "Ticket\nRegistration number: " + getVehicleRegistrationNumber();
    }
}
