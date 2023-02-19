package flight.reservation.payment;

import java.util.Date;

/**
 *  credit card class. This becomes the DTO
 */
public class CreditCard {
    private double amount;
    private String number;
    private Date date;
    private String cvv;
    private boolean valid;

    public CreditCard(String number, Date date, String cvv) {
        this.amount = 100000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
        this.setValid();
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    //Added the following three get methods for Credit Card Strategy to get these values
    public String getCCNumber() {
        return this.number;
    }
    public Date getExpireDate() {
        return date;
    }
    public String getCVV() {
        return this.cvv;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid() {
        // Dummy validation
        this.valid = number.length() > 0 && date.getTime() > System.currentTimeMillis() && !cvv.equals("000");
    }
}