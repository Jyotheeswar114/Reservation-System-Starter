package flight.reservation.payment;

public class MyWallet implements Wallet {
    private double availableBalance;

    public MyWallet(){
        this.availableBalance = 4000;
    }

    public boolean deductFromWallet(double amount){
        if (this.availableBalance>amount)
        {
            this.availableBalance = this.availableBalance-amount;
            return true;
        }
        else{
            return false;
        }


    }
}
