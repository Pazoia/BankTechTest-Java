import java.util.ArrayList;

public class BankAccount {
    ArrayList<Integer> transactions = new ArrayList<Integer>();

    void deposit(int valueToDeposit) {
        transactions.add(valueToDeposit);
    }

    void withdraw(int valueToWithdraw) {
        transactions.add(valueToWithdraw);
    }
}
