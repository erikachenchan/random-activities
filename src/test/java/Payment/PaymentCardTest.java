package Payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentCardTest {
    PaymentCard person;

    @BeforeEach
    void setUp() throws Exception {
        person = new PaymentCard(100);
        person.setBalance(1000);
    }

    @Test
    void getTheBalance() throws Exception {
        assertEquals(1000, person.getBalance());
    }
}
