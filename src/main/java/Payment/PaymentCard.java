package Payment;

public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        return false;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
