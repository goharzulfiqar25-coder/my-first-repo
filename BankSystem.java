class Account {  //Zulfiqar Gauhar Sap id 76579
    
    String name;
    int balance;

    Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
        void show() {  //Zulfiqar Gauhar Sap id 76579
            System.out.println("Name:" + name);
            System.out.println("Balance: " + balance);
        }
}
class Bank extends Account {  //Zulfiqar Gauhar Sap id 76579
    Bank(String name, int balance) {
    super(name, balance);
    }
    void deposit(int amount) {  //Zulfiqar Gauhar Sap id 76579
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void deposit(int amount, int bouns) {
        balance += amount + bouns; //Zulfiqar Gauhar Sap id 76579
        System.out.println("Deposited with bouns: " + (amount + bouns));
    }
    void withdraw(int amount) {
        if(amount <= balance) { //Zulfiqar Gauhar Sap id 76579
            balance -= amount; 
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    void show() { //Zulfiqar Gauhar Sap id 76579
        System.out.println("\n---Bank Account Details---");
        System.out.println("Name:" + name);
        System.out.println("Balance: " + balance);
    }
}
class premiumBank extends Bank { //Zulfiqar Gauhar Sap id 76579
    premiumBank(String name, int balance) {
        super(name, balance);
    }

    @Override
    void show() { //Zulfiqar Gauhar Sap id 76579
        System.out.println("---Premium Account---");
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Status:  Premium customer");
    }
}

public class BankSystem { //Zulfiqar Gauhar Sap id 76579
    public static void main(String[] args) {
        Bank b = new Bank("Zulfiqar Gauhar ", 10000);
        b.deposit(5000);
        b.deposit(500, 300 );
        b.withdraw(5000);
        b.show(); //Zulfiqar Gauhar Sap id 76579
        
        premiumBank p = new premiumBank("Adnan Shafi ", 5000);
        p.show();
    }
}
