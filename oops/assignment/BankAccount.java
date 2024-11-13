package oops.assignment;

enum BankName {
    ICICI(6.3),
    HDFC(5.8),
    SBI(6.0);

    double interestRate; // Interest rate for each bank

    // Constructor for the enum that sets the interest rate
    BankName(double interestRate) {
        this.interestRate = interestRate;
    }
}

public class BankAccount {
    
    private double accountBalance; // Account balance
    private String accountHolderName; // Account holder's name
    private BankName bankName; // Bank name (Enum type)

    // Constructor to initialize the account
    public BankAccount(double accountBalance, String accountHolderName, BankName bankName) {
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
    }

    // Getter for account balance
    public double getAccountBalance() {
        return accountBalance;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter for bank name
    public BankName getBankName() {
        return bankName;
    }

    // Method to deposit money
    public void deposit(double amount) {
        accountBalance += amount;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to calculate the total interest over a number of years
    public void calculateInterest(int numberOfYears) {
        // Interest formula: Interest = (Rate * Balance * Years) / 100
        double totalInterest = (bankName.interestRate * numberOfYears * accountBalance) / 100;
        System.out.printf("Total interest for %d years at %.2f%% interest rate: %.2f\n", 
                          numberOfYears, bankName.interestRate, totalInterest);
    }

    // Main method to test the program
    public static void main(String[] args) {
        // Create a BankAccount object with initial balance and bank name
        BankAccount account1 = new BankAccount(12000, "Jack", BankName.HDFC);

        // Perform a deposit operation
        account1.deposit(5000);
        System.out.println("Updated account balance: " + account1.getAccountBalance());

        // Display bank name
        System.out.println("Bank: " + account1.getBankName());

        // Calculate and print total interest for 10 years
        account1.calculateInterest(10);
    }
}
