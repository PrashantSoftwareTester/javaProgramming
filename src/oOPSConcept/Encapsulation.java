package oOPSConcept;

 class BankAccount {
	
    // Private variables
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
 // Getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }
    
    // Setter method for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
    
 // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    
 // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

  public class Encapsulation {

	public static void main(String[] args) {

		BankAccount account = new BankAccount("1234567890", 500.0);

        // Accessing account details through getter methods
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        // Depositing money
        account.deposit(200.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdrawing money
        account.withdraw(100.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Trying to set a negative balance (should not be allowed)
        account.setBalance(-100.0);
        System.out.println("Balance after trying to set negative value: " + account.getBalance());
	
		
	}

}
