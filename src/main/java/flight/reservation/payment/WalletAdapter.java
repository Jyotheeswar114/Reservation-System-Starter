package flight.reservation.payment;

public class WalletAdapter implements PaymentStrategy{
    MyWallet customerWallet;
    public WalletAdapter(MyWallet customerWallet){
        this.customerWallet = customerWallet;
    }

    public void pay(double amount){
         Boolean isPaid = customerWallet.deductFromWallet( amount);
         if (isPaid)
             System.out.println("Deducted from Wallet");
         else
             System.out.println("Low Balance and could not deduct from Wallet");
    }
}
