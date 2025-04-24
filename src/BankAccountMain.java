
public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  BankAccount account = new BankAccount(); // Creating an object

	        // Depositing money
	        account.deposit(1000);
	        
	        // Withdrawing money
	        account.withdraw(500);

	        // Getting the balance
	        System.out.println("Current Balance: $" + account.getBalance());
	}

}
