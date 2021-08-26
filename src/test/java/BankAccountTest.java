import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    @DisplayName("Bank Account starts with £0 balance")
    void bankAccountStartsWithZeroBalance() {
        BankAccount bankAccount = new BankAccount();
        int balance = bankAccount.balance;
        assertEquals(0, balance);
    }
}
