public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount() {
        this.accountNumber = "000000";
        this.ownerName = "Unknown";
        this.balance = 0;
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }  else {
            System.out.println("Balance cannot be negative!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            this.balance -= amount;
            System.out.println("Withdraw successful!");
        }
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        // Tạo 2 đối tượng
        BankAccount acc1 = new BankAccount("111", "Alice", 1000);
        BankAccount acc2 = new BankAccount("222", "Bob", 500);

        System.out.println("=== INITIAL STATE ===");
        acc1.displayInfo();
        acc2.displayInfo();

        // Thao tác trên acc1
        acc1.deposit(300);
        acc1.withdraw(200);

        // Thao tác trên acc2
        acc2.withdraw(700); // rút quá số dư
        acc2.deposit(1000);

        System.out.println("\n=== AFTER TRANSACTIONS ===");
        acc1.displayInfo();
        acc2.displayInfo();
    }
}
