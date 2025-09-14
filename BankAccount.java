public class BankAccount {
    // Fields (member variables)
    private String accountNumber;
    private double balance;
    private String ownerName;

    // Constructor to initialize a new BankAccount object
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0; // Initial balance is zero
    }

    // Methods to perform operations
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Getter method to get the current balance
    public double getBalance() {
        return this.balance;
    }
    
    // Getter method for account owner
    public String getOwnerName() {
        return this.ownerName;
    }

    public static void main(String[] args) {
        // Create an object (an instance of the BankAccount class)
        BankAccount myAccount = new BankAccount("123456789", "Alice Johnson");

        System.out.println("Account Owner: " + myAccount.getOwnerName());
        System.out.println("Initial Balance: $" + myAccount.getBalance());

        // Call the methods on the object
        myAccount.deposit(1500.00);
        System.out.println("Current Balance: $" + myAccount.getBalance());

        myAccount.withdraw(350.50);
        System.out.println("Current Balance: $" + myAccount.getBalance());

        myAccount.withdraw(2000.00); // This will fail due to insufficient balance
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}