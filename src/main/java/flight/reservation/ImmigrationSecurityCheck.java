package flight.reservation;

public class ImmigrationSecurityCheck implements SecurityClearanceInterface {

    public void setNextValidator(SecurityClearanceInterface obj)
    {
        this.nextValidator = obj;
    }
    public boolean requestHandle()
    {
        // Handle respective Functionalities
    }    
}