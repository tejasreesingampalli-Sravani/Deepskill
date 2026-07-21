class BankAccount {
    int accountId;
    String holderName;
    double balance;

    BankAccount(int accountId, String holderName, double balance) {
        this.accountId = accountId;
        this.holderName = holderName;
        this.balance = balance;
    }
}

public class TransferFunds {

    public static void transferFunds(
            BankAccount source,
            BankAccount destination,
            double amount) {

        if (source.balance >= amount) {
            source.balance -= amount;
            destination.balance += amount;

            System.out.println("Transfer Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount(101, "John", 10000);

        BankAccount account2 =
                new BankAccount(102, "Mary", 5000);

        transferFunds(account1, account2, 3000);

        System.out.println("John Balance: " + account1.balance);
        System.out.println("Mary Balance: " + account2.balance);
    }
}
