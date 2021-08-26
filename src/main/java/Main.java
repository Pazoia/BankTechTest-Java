public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(1000);
        System.out.println("My balance: ￡" + bankAccount.balance);

        bankAccount.deposit(2000);
        System.out.println("My balance: ￡" + bankAccount.balance);

        bankAccount.withdraw(500);
        System.out.println("My balance: ￡" + bankAccount.balance);
    }
}
