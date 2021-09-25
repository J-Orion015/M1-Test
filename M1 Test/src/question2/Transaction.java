package question2;
import question2.InsufficientBalanceException;
public class Transaction {
	public static void deposit(Account account, double amount){
		account.setBal(account.getBal()-amount);
	}
	public static void withdraw(Account account, double amount) {
		double balance= account.getBal();
		if(balance-amount>=5000)
			account.setBal(balance-amount);
		else
			throw new InsufficientBalanceException(balance-amount+ "is low");			
	}
}