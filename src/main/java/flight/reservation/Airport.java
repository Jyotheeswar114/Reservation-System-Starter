package flight.reservation;

import flight.reservation.flight.Flight;

import java.util.List;

public class Airport implements FlightComposite{

    private final String name;
    private final String code;
    private final String location;
    private List<Flight> flights;
    private List<ScheduledFlight> scheduledFlights;
    private String[] allowedAircrafts;

    public Airport(String name, String code, String location) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.allowedAircrafts = new String[]{"A380", "A350", "Embraer 190", "Antonov AN2", "H1", "H2", "HypaHype"};
    }

    public Airport(String name, String code, String location, String[] allowedAircrafts) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.allowedAircrafts = allowedAircrafts;
    }

    public number getScheduledFlightCrewCapacity(){
        int s = 0;
        for(ScheduledFlight sf: this.scheduledFlights){
            s += sf.getScheduledFlightCrewCapacity();
        }
        return s;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getLocation() {
        return location;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public void setScheduledFlights(List<ScheduledFlight> flights) {
        this.scheduledFlight = flights;
    }

    public String[] getAllowedAircrafts() {
        return allowedAircrafts;
    }
}
