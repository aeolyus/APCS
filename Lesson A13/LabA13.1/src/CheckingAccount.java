/**
 * @author Richard Huang
 */
public class CheckingAccount {
	private double myBalance;
	private int myAccountNumber;
	
	public CheckingAccount(){
		myBalance = 0;
		myAccountNumber = 0;
	}
	public CheckingAccount(double initialBalance, int acctNum){
			myBalance = initialBalance;
			myAccountNumber = acctNum;
			if(myBalance<0)throw new IllegalArgumentException("Negative balance in account "+myAccountNumber);
	}
	public double getBalance(){
		return myBalance;
	}
	public void deposit(double amount){
		if(amount<0)throw new IllegalArgumentException("Negative amount deposited in account "+myAccountNumber);
		myBalance += amount;
	}
	public void withdraw(double amount){
		if((myBalance-amount)<0)throw new IllegalArgumentException("Account "+myAccountNumber+" overdrawn");
		myBalance -= amount;
	}
}
