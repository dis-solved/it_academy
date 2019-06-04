package lesson14.homework14;

public class Parking {
    private Vehicle[][] parkingSlots;


    public Parking(int row, int slot){
        this.parkingSlots = new Vehicle[row][slot];
    }

    public Ticket parkVehicle(Vehicle vehicle) throws NoParkingSlotsException{
        for (int i = 0; i < this.parkingSlots.length; i++){
            for (int j = 0; j < this.parkingSlots[i].length; j++){
                if (this.parkingSlots[i][j] == null){
                    this.parkingSlots[i][j] = vehicle;
                    return new Ticket(vehicle.getRegistrationNumber(), i, j);
                }
            }
        }
        throw new NoParkingSlotsException();
    }

    public Vehicle getVehicle (Ticket ticket) throws TicketInvalidException {
        int row = ticket.getRow();
        int slot = ticket.getSlot();

        Vehicle vehicle = this.parkingSlots[row][slot];
        if (this.parkingSlots[row][slot] == null || vehicle.getRegistrationNumber().equals(ticket.getVehicleRegistrationNumber())){
            throw new TicketInvalidException();
        }
        this.parkingSlots[row][slot] = null;
        return vehicle;
    }

    public int getAvailableSlots(){
        int count = 0;
        for (int i = 0; i < this.parkingSlots.length; i++){
            for (int j = 0; j < this.parkingSlots[i].length; j++){
                if (this.parkingSlots[i][j] == null){
                    count++;
                }
            }
        }
        return count;
    }
}