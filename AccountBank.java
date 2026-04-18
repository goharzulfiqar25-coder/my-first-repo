class BankAccount {  //Zulfiqar Gauhar SAP ID : 76579 
    String accountTitle;
    int accountNumber;
    double balance;

    BankAccount(String title, int number, double bal) {
        accountTitle = title;
        accountNumber = number;
        balance = bal;
    }

    void deposit(double amount) {  //Zulfiqar Gauhar SAP ID : 76579 
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void display() {   //Zulfiqar Gauhar SAP ID : 76579 
        System.out.println("Account Title: " + accountTitle);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// -------- Saving Account --------
class SavingAccount extends BankAccount {

    SavingAccount(String title, int number, double bal) {
        super(title, number, bal);
    }

    @Override
    void deposit(double amount) {  //Zulfiqar Gauhar SAP ID : 76579 
        balance += amount;
        System.out.println("Saving Account Deposit: " + amount);
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Saving Account: Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Saving Account Withdraw: " + amount);
        }
    }
}
//Zulfiqar Gauhar SAP ID : 76579 
// -------- Checking Account --------
class CheckingAccount extends BankAccount {

    CheckingAccount(String title, int number, double bal) {
        super(title, number, bal);
    }

    @Override
    void deposit(double amount) { //Zulfiqar Gauhar SAP ID : 76579 
        balance += amount;
        System.out.println("Checking Account Deposit: " + amount);
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Checking Account: Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Checking Account Withdraw: " + amount);
        }
    }
}

// -------- Main Class --------
public class AccountBank { //Zulfiqar Gauhar SAP ID : 76579 
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount("Zulfiqar Gauhar", 151, 5000);
        CheckingAccount ca = new CheckingAccount("Adana Shafi", 151, 3000);

        System.out.println("---- Saving Account ----"); //Zulfiqar Gauhar SAP ID : 76579 
        sa.display();
        sa.deposit(1000);
        sa.withdraw(2000);
        sa.display();

        System.out.println("\n---- Checking Account ----"); //Zulfiqar Gauhar SAP ID : 76579 
        ca.display();
        ca.deposit(1500);
        ca.withdraw(1000);
        ca.display();
    }
}