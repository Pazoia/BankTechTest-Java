public class BankAccount {
    int balance = 0;

    int deposit(int valueToDeposit) {
        return balance += valueToDeposit;
    }

    int withdraw(int valueToWithdraw) {
        return balance -= valueToWithdraw;
    }
}
