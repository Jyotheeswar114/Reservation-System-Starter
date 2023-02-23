package flight.reservation;

public class NBCSecurityCheck implements SecurityClearanceInterface {

    public void setNextValidator(SecurityClearanceInterface obj)
    {
        throw IllegalHandlerSet;
    }
    public boolean requestHandle()
    {
        // Handle respective Functionalities
    }    
}