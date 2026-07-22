class Account {
    int accountId;
    String accountType;
    double balance;

    Account(int accountId, String accountType, double balance) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.balance = balance;
    }
}

public class ProcessMonthlyInterest {

    public static void processMonthlyInterest(Account[] accounts) {
        for (Account account : accounts) {
            if (account.accountType.equalsIgnoreCase("Savings")) {
                account.balance += account.balance * 0.01;
            }
        }
    }

    public static void main(String[] args) {
        Account[] accounts = {
            new Account(101, "Savings", 10000),
            new Account(102, "Current", 15000),
            new Account(103, "Savings", 20000)
        };

        processMonthlyInterest(accounts);

        for (Account account : accounts) {
            System.out.println("Account ID: " + account.accountId +
                    ", Balance: " + account.balance);
        }
    }
}
