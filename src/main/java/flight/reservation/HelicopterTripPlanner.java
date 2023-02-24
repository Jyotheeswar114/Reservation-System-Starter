public class HelicopterTripPlanner implements TripPlanner {
    crew: Staff[];
    passengers: Passenger[];
    pilot: Staff

    public void setPilot() {
        this.pilot = getPhysicalPilot();
    }
    public void setCrew(crew: Staff[]) {
        this.crew = crew;
    }
    public void setPAssengers() {
        this.passengers = new Passenger[];
    }
}