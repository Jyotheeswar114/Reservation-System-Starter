public class MakeReservationCommand implements Command {
    private Reservation reservation;

    public MakeReservationCommand(List<String> passengerNames, List<ScheduledFlight> flights, double price) {
        // this.flightOrder = flightOrder;
        // order code will come here
    }

    public void execute() {
        // Code to make reservation
        System.out.println("The order has been booked.");
    }
}