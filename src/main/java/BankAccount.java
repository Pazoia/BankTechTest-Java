public class BankAccount {
    int balance = 0;

    int deposit(int valueToDeposit) {
        return balance += valueToDeposit;
    }
}
