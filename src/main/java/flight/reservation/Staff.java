package flight.reservation;

import flight.reservation.flight.ScheduledFlight;
import flight.reservation.order.FlightOrder;
import flight.reservation.order.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Staff implements UserInterface {

    private final String name;

    public Staff(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String message) {
        System.out.println(String.format("notifing %s with message: %s", name, message));
    }

}
