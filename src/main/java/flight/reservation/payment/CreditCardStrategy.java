package flight.reservation.payment;

import java.util.Date;

public class CreditCardStrategy implements PaymentStrategy {


    private String cardNumber;
    private String cvv;
    private Date dateOfExpiry;

    public CreditCardStrategy(CreditCard ccObject){
        this.cardNumber=ccObject.getCCNumber();
        this.cvv=ccObject.getCVV();
        this.dateOfExpiry=ccObject.getExpireDate();
    }
    @Override
    public void pay(double amount) {
        System.out.println(amount +" paid with credit/");
    }

}
