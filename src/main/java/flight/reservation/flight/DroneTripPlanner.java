public class DroneTripPlanner implements TripPlanner {
    crew: Staff[];
    passengers: Passenger[];
    pilot: Staff

    public void setPilot() {
        this.pilot = getVirutalPilot();
    }
    public void setCrew(crew: Staff[]) {
        this.crew = crew;
    }
    public void setPAssengers() {
        this.passengers = new Passenger[];
    }
}