// 18.Create a class Account to deposit and withdraw money from a bank. Create a user
// defined exception “MinBalExp‟ to be invoked when the withdrawal amount is
// greater than balance.


// Custom exception for insufficient balance
class NotSufficientFundException extends RuntimeException {
    public NotSufficientFundException(String message) {
        super(message);
    }
}

class Account {
    private double balance = 1000;

    // Method to get the current balance
    public double balance() {
        return balance;
    }

    // Method to withdraw money
    public void withdraw(int amount) throws NotSufficientFundException {
        if (amount > balance) {
            throw new NotSufficientFundException(
                String.format("Current balance %.2f is less than requested amount %d", balance, amount)
            );
        }
        balance -= amount; // Deduct the amount from the balance
    }

    // Method to deposit money
    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                String.format("Invalid deposit amount %d. Amount must be greater than 0.", amount)
            );
        }
        balance += amount; // Add the amount to the balance
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        Account acct = new Account();

        try {
            System.out.println("Withdrawing 200");
            acct.withdraw(200);
            System.out.println("Current balance: " + acct.balance());
            System.out.println("Withdrawing 1000");
            acct.withdraw(1000); // will throw NotSufficientFundException
            
        } catch (NotSufficientFundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Depositing -500");
            acct.deposit(-500); // will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}