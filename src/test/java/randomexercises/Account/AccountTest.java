package randomexercises.Account;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {
    Account account;

    @BeforeEach
    void setUp() throws Exception {
        account = new Account("1", 100, "Rei", "test@test.com", "1234");
        account.setNumber("1");
        account.setBalance(100);
        account.setCustomerName("Rei");
        account.setCustomerEmail("test@test.com");
        account.setCustomerPhone("1234");
    }


    @Test
    void initAccountObjectCreation() throws Exception {
        assertEquals("1", account.getNumber());
        assertEquals(100, account.getBalance());
        assertEquals("Rei", account.getCustomerName());
        assertEquals("test@test.com", account.getCustomerEmail());
        assertEquals("1234", account.getCustomerPhone());
    }


    @Test
    void addDepositFundAmount() throws Exception {
        account.depositFunds(1);
        assertEquals(102, account.depositFunds(1));


    }


    @Test
    void shouldWithdrawSuccesfully() throws Exception {
        account.withdrawFunds(1000);
        assertEquals(5, account.withdrawFunds(5));

    }

    @Test
    void unsuccessfullWithdrawMessage() throws Exception {
        account.withdrawFunds(100);

        String msg1 = "Insufficient funds! You only have £ ";

        if (account.getBalance() - account.withdrawFunds(5) < 0) {
            System.out.println(msg1 + account.getBalance());
            assertEquals("Insufficient funds! You only have £ ", msg1);

        }

    }

    @Test
    void toStringReturnsAccountDetailsString() throws Exception {
        account = new Account("1", 25, "Rei", "test@test.com", "1245");

        assertEquals(account.toString(), "{ Account Number: " + account.getNumber() + ",\n"
                + " Balance: " + account.getBalance() + ",\n"
                + " Customer Name: " + account.getCustomerName() + ",\n"
                + " Customer Email: " + account.getCustomerEmail() + ",\n"
                + " Customer Phone: " + account.getCustomerPhone() + " }");
    }

}
