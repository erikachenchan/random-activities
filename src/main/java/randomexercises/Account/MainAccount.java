package randomexercises.Account;

public class MainAccount {

    public static void main(String[] args) {
//        WITH EMPTY CONSTRUCTOR
//        Account myAccount = new Account();
//        myAccount.setNumber("1");
//        myAccount.setBalance(100);
//        myAccount.setCustomerEmail("test@test.com");
//        myAccount.setCustomerName("Customer Name");
//        myAccount.setCustomerPhone("1242");
//        System.out.println("");
//        System.out.println("Balance: " + myAccount.getBalance());
//        myAccount.depositFunds(20);
//        myAccount.withdrawFunds(5);
//        System.out.println("");
//        System.out.println(myAccount);

        // WITH CONSTRUCTOR, you can set an empty constructor
        // Passing arguments to the new keyword, to set field
//        Account newAccount = new Account("1", 59, "john", "john@test.com", "2422212");
//        newAccount.setBalance(100);
//        newAccount.depositFunds(2);
//        newAccount.withdrawFunds(103);
//        System.out.println(newAccount);

        // WITH DEFAULT CONS
//        Account newAccount = new Account("");
//        newAccount.setNumber("1");
//        newAccount.setCustomerEmail("test@test.com");
//        newAccount.setCustomerName("Customer Name");
//        newAccount.setCustomerPhone("1242");
//        System.out.println("");
//        newAccount.depositFunds(5);
//        newAccount.withdrawFunds(10); // trying to withdraw money higher than the curr balance.
//        System.out.println("Current balance: " + newAccount.getBalance());
//        System.out.println("");
//        System.out.println(newAccount);

        Account account = new Account("1", 20, "rei", "test@test.com", "0142112");
        account.depositFunds(10);
        System.out.println("");
        account.withdrawFunds(5);
    }
}
