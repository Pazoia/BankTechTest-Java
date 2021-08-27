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
        assertEquals(0, bankAccount.transactions.size());
    }

    @Test
    @DisplayName("As a user I want to be able to make a deposit")
    void bankAccountAcceptsDeposits() {
        bankAccount.deposit(1000);
        assertEquals(1000, bankAccount.transactions.get(0));
    }

    @Test
    @DisplayName("As a user I want to be able to withdraw money from my account")
    void bankAccountAllowsForMoneyToBeWithdrawn() {
        bankAccount.withdraw(500);
        assertEquals(500, bankAccount.transactions.get(0));
    }
}
