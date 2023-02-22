package flight.reservation;

import flight.reservation.flight.ScheduledFlight;
import flight.reservation.order.FlightOrder;
import flight.reservation.order.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface UserInterface {
    public void update(String message);
}