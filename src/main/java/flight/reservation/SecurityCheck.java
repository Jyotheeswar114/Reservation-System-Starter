package flight.reservation;

public class SecurityCheck implements SecurityClearanceInterface {
    public GateSecurityCheck check1 = new GateSecurityCheck();
    public CustomsSecurityCheck check2 = new CustomsSecurityCheck();
    public ImmigrationSecurityCheck check3 = new ImmigrationSecurityCheck();
    public NBCSecurityCheck check4 = new NBCSecurityCheck();
    check1.setNextValidator(check2);
    check2.setNextValidator(check3);
    check3.setNextValidator(check4);
    check1.requestHandle();
}