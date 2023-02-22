public class CancelReservationCommand implements Command {
    private Reservation reservation;

    public CancelReservationCommand(Reservation reservation) {
        this.reservation = reservation;
    }

    public void execute() {
        // Code to cancel reservation
        System.out.println("The order has been canceled.");
    }
}