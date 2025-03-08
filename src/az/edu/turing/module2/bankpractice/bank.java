package az.edu.turing.module2.bankpractice;

public class bank {
    public static void main(String[] args) {
        // Create two accounts
        BankAccount alice = new BankAccount("Alice", 500, "ABC Bank");
        BankAccount bob = new BankAccount("Bob", 300, "XYZ Bank");

        // Display initial info
        System.out.println("Before Transfer:");
        alice.ShowInfo();
        bob.ShowInfo();

        // Transfer money from Alice to Bob
        alice.transferMoney(bob, 200);

        // Display updated info
        System.out.println("\nAfter Transfer:");
        alice.ShowInfo();
        bob.ShowInfo();

        // Try an invalid transfer
        alice.transferMoney(bob, 500);
    }
}
