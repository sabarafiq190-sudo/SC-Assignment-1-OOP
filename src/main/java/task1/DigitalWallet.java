package task1;

public class DigitalWallet {
    private String accountHolder;
    private double balance;
    private final String pinCode;

    public DigitalWallet(String accountHolder, double initialBalance, String pinCode) {
        this.accountHolder = accountHolder;
        this.pinCode = pinCode;
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public boolean withdraw(double amount, String enteredPin) {
        if (amount <= 0) {
            return false;
        }
        if (!this.pinCode.equals(enteredPin)) {
            return false;
        }
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}
