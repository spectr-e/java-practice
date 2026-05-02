// A class is a blueprint. An object is a thing built from that blueprint.

public class BankAccount {

    // Instance fields — each object has its OWN copy of these
    private String owner;
    private double balance;
    private int transactionCount;

    // Constructor — the "factory method" that builds a new instance
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;             // 'this' means "this specific object"
        this.balance = initialBalance;
        this.transactionCount = 0;
    }

    // Instance methods — act on THIS object's data
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive: " + amount);
        }
        this.balance += amount;
        this.transactionCount++;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be positive");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds");
        }
        this.balance -= amount;
        this.transactionCount++;
    }

    // 3. transfers money from one account to another
    public void transfer(BankAccount acc, int amount) {
        if (balance < amount) {
            throw new IllegalStateException("Insufficient funds");
        }
        this.balance -= amount;
        acc.deposit(amount);
        System.out.println("You have transfered: " + amount + " from " + owner + " to " + acc.getOwner());
        System.out.println("Current balance of " + owner + " is " + balance + ". New balance of " + acc.getOwner() + " is " + acc.getBalance());
    }

    // Getters — controlled read access to private fields
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    // toString — what to print when you System.out.println an object
    @Override
    public String toString() {
        return "{ owner = '" + owner + "', balance = " + balance + " }";
    }
}
