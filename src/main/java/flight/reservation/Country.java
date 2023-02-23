package flight.reservation;

public class Country implements FlightComposite {
    public FlightComposite[] states;

    public int getScheduledFlightCrewCapacity(){
        int s = 0;
        for(State state: this.states){
            s += state.getScheduledFlightCrewCapacity();
        }
        return s;
    }
}