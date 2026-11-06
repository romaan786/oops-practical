class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
        } else {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Rahul", 1001, 5000);
        System.out.println("Holder: " + acc.getAccountHolder());
        System.out.println("Account No: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());
        acc.deposit(2000);
        System.out.println("Balance: " + acc.getBalance());
        acc.deposit(-500);
        System.out.println("Balance: " + acc.getBalance());
        acc.withdraw(1500);
        System.out.println("Balance: " + acc.getBalance());
        acc.withdraw(0);
        acc.withdraw(-200);
        acc.withdraw(10000);
        System.out.println("Balance: " + acc.getBalance());
    }
}