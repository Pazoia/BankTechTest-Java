import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    BankAccount bankAccount;

    @BeforeEach
    void initEach() {
        bankAccount = new BankAccount();
    }

    @Test
    @DisplayName("Bank Account starts with £0 balance")
    void bankAccountStartsWithZeroBalance() {
        int balance = bankAccount.balance;
        assertEquals(0, balance);
    }

    @Test
    @DisplayName("As a user I want to be able to make a deposit")
    void bankAccountAcceptsDeposits() {
        int balance = bankAccount.deposit(1000);
        assertEquals(1000, balance);
    }

    @Test
    @DisplayName("As a user I want to be able to withdraw money from my account")
    void bankAccountAllowsForMoneyToBeWithdrawn() {
        bankAccount.deposit(1000);
        int balance = bankAccount.withdraw(500);
        assertEquals(500, balance);
    }
}
