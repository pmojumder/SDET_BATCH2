
public class BankingSystems {
	 public static void main(String[] args) {
	        Bank bank = new Bank();
	        bank.showInterestRate(); // Output: Bank: General interest rate is 5%

	        SavingsAccount savings = new SavingsAccount();
	        savings.showInterestRate(); // Output: Savings Account: Interest rate is 6%

	        CurrentAccount current = new CurrentAccount();
	        current.showInterestRate(); // Output: Current Account: No interest on current accounts.

	        // Now, let's check behavior when using polymorphism
	        Bank bankRef = new SavingsAccount();
	        bankRef.showInterestRate(); // Output: Bank: General interest rate is 5% (Not overridden, resolved at compile-time)
	    }
}
