package randomexercises.Payment;

public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


    public boolean takeMoney(double amount) {
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        if (this.getBalance() >= amount) {
            this.balance = this.balance - amount;
            return true;
        }
        return false;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
