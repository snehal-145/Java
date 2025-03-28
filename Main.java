class BankAccount {
    protected double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Subclass SavingsAccount that restricts withdrawals if balance < $100
class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Override withdraw method with added restriction
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied. Minimum balance of $100 must be maintained.");
        } else {
            super.withdraw(amount);
        }
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(500);

        savings.displayBalance();
        savings.deposit(200);
        savings.withdraw(550);  // Should deny this withdrawal
        savings.withdraw(100);  // Should allow this withdrawal
        savings.displayBalance();
    }
}
