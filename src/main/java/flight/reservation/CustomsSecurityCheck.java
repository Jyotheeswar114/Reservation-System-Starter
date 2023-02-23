package flight.reservation;

public class CustomsSecurityCheck implements SecurityClearanceInterface {

    public void setNextValidator(SecurityClearanceInterface obj)
    {
        this.nextValidator = obj;
    }
    public boolean requestHandle()
    {
        // Handle respective Functionalities
    }    
}