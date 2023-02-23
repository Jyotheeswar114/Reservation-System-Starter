package flight.reservation;

public class GateSecurityCheck implements SecurityClearanceInterface {

    public void setNextValidator(SecurityClearanceInterface obj)
    {
        this.nextValidator = obj;
    }
    public boolean requestHandle()
    {
        // Handle respective Functionalities
    }    
}