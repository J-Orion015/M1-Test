package question2;
import question2.InsufficientBalanceException;
import question2.Account;
import question2.Transaction;
public class Main {
	public static void main(String[] args) {
		Account a=new Account(1234, 5678);
		try {
			Transaction.withdraw(a, 3456);			
		}
		catch(InsufficientBalanceException ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("Updated balance: "+a.getBal());
	}
}