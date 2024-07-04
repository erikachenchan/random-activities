package randomexercises.Account;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public double depositFunds(double depositAmount) {
        double balanceAfterDepo = (balance += depositAmount);
        System.out.println("Deposit of £ " + depositAmount + " made . New balance is £ " + balanceAfterDepo);
        return balanceAfterDepo;
    }

    public double withdrawFunds(double withdrawAmount) {

        String msg1 = "Insufficient funds! You only have £ ";

        if (balance - withdrawAmount < 0) {
            System.out.println(msg1 + this.balance);
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdraw of £ " + withdrawAmount + " processed,  Remaining balance = £" + this.balance);
        }
        return withdrawAmount;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setNumber(String number) {
        this.number = number;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String toString() {
        return "{ Account Number: " + number + ",\n"
                + " Balance: " + balance + ",\n"
                + " Customer Name: " + customerName + ",\n"
                + " Customer Email: " + customerEmail + ",\n"
                + " Customer Phone: " + customerPhone + " }";
    }
}
