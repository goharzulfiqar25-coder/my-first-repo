class BankAccount {

    private int accountNumber;
    private double balance;

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.setAccountNumber(12345);
        b.setBalance(10000);

        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Balance: " + b.getBalance());
    }
}