package az.edu.turing.module2.bankpractice;

public class BankAccount {
    private String AccountHolder;  // Private for encapsulation
    private int balance;           // Private to control access
    private String bankName;       // Each object has its own bank

    // Constructor to initialize values
    public BankAccount(String accountHolder, int balance, String bankName) {
        this.AccountHolder = accountHolder;  // Fixed assignment
        setBalance(balance);                // Use setter for validation
        this.bankName = bankName;           // Non-static for individual banks
    }

    // Getter for account holder
    public String getAccountHolder() {
        return AccountHolder;
    }

    // Setter for account holder
    public void setAccountHolder(String accountHolder) {
        this.AccountHolder = accountHolder; // Fixed to accept input
    }

    // Getter for balance
    public int getBalance() {
        return balance;
    }

    // Setter for balance with validation
    public void setBalance(int balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance can't be negative.");
        }
    }

    // Method to show account information
    public void ShowInfo() {
        System.out.println("Holder: " + AccountHolder + ", Balance: " + balance + ", Bank: " + bankName);
    }

    // Transfer money between accounts
    public void transferMoney(BankAccount target, double amount) {
        if (amount > 0 && balance >= amount) {
            this.balance -= amount;                  // Deduct from sender
            target.setBalance(target.getBalance() + (int) amount);  // Add to receiver
            System.out.println(amount + " transferred to " + target.getAccountHolder());
        } else {
            System.out.println("Transfer failed: Invalid amount or insufficient balance.");
        }
    }
}
