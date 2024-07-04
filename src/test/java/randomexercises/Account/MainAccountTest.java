package randomexercises.Account;

import Account.MainAccount;
import org.junit.jupiter.api.Test;

class MainAccountTest {


    @Test
    void init() throws Exception {
        MainAccount.main(new String[]{"arg1", "arg2", "arg3"});
    }
}
