package flight.reservation;

public class State implements FlightComposite{
    public Airport[] airports;

    public int getScheduledFlightCrewCapacity(){
        int s = 0;
        for(Airport airport: this.airports){
            s += airport.getScheduledFlightCrewCapacity();
        }
        return s;
    }
}