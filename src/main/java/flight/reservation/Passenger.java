package flight.reservation;


public class Passenger implements UserInterface {

    private final String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String message) {
        System.out.println(String.format("notifing %s with message: %s", name, message));
    }

}
