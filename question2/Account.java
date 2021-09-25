package question2;
import java.time.LocalDate;
public class Account {
	int accountNumber;
    String accountHolderName;
    LocalDate openedDate;
    double balance;
    public Account(int accountNumber,double balance)
    {
    	this.accountNumber=accountNumber;
    	this.balance=balance;
    }
    public int getAccountNo()
    {
    	return accountNumber;
    }
    public void setAccountNo(int accountNumber)
    {
    	this.accountNumber=accountNumber;
    }
    public double getBal() {
    	return balance;
    }
    public void setBal(double balance)
    {
    	this.balance=balance;
    }
}