package flight.reservation.payment;

public interface Wallet {
    boolean deductFromWallet(double amount);
}
