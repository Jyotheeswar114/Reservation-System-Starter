public class PassengerPlaneTripPlanner implements TripPlanner {
    crew: Staff[];
    passengers: Passenger[];
    pilot: Staff
    assistantPilot: Staff

    public void setPilot() {
        this.pilot = getPhysicalPilot();
        this.assistantPilot = getPhysicalPilot();
    }
    public void setCrew(crew: Staff[]) {
        this.crew = crew;
    }
    public void setPAssengers() {
        this.passengers = new Passenger[];
    }
}