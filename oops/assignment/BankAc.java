package oops.assignment;

class BankAc {
    // Fields
    private String accountHolderName;  // Name of the account holder
    private String bankName;			// Name of the bank
    private double accountBalance;		// Current balance of the account

    // Constructor
    public BankAc(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    // Method to get the current balance
    public double getBalance() {
        return accountBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Amount was Credit/Deposit " + amount + " into account " + accountHolderName);
            System.out.println();
        } else {
            System.out.println("No Negative Will be taken.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrew " + amount + " from account of " + accountHolderName);
            System.out.println();
        } else if (amount > accountBalance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Creating three bank accounts
        BankAc account1 = new BankAc("Chirag", "ICICI", 62500.00);
        BankAc account2 = new BankAc("Bhumi", "HDFC", 45000.00);
        BankAc account3 = new BankAc("Dharsha", "SBI", 78800.00);

        // Displaying initial account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();

        // Deposit and withdraw operations
        account1.deposit(3000.00);
        account2.withdraw(5000.00);
        account3.deposit(6000.00);

        // Displaying account balances after operations
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();
    }
}
