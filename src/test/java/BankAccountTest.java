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

    @Test
    @DisplayName("As a user I want to be able to make a deposit")
    void bankAccountAcceptsDeposits() {
        BankAccount bankAccount = new BankAccount();
        int balance = bankAccount.deposit(1000);
        assertEquals(1000, balance);
    }
}
