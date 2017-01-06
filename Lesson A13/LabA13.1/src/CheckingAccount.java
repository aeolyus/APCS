/**
 * @author Richard Huang
 */
public class CheckingAccount {
	private double myBalance;//money
	private int myAccountNumber;//account numer
	/**
	 * Default constructor sets balance and account number to 0
	 */
	public CheckingAccount(){
		myBalance = 0;
		myAccountNumber = 0;
	}
	/**
	 * Constructor initiliazes a checkingaccount with the given balance and acount number
	 * @param initialBalance intial balance
	 * @param acctNum account number
	 */
	public CheckingAccount(double initialBalance, int acctNum){
			myBalance = initialBalance;
			myAccountNumber = acctNum;
			if(myBalance<0)throw new IllegalArgumentException("Negative balance in account "+myAccountNumber);
	}
	/**
	 * Gets the balance
	 * @return returns the balance
	 */
	public double getBalance(){
		return myBalance;
	}
	/**
	 * Deposits a given amount to the account
	 * @param amount Amount to deposit
	 */
	public void deposit(double amount){
		if(amount<0)throw new IllegalArgumentException("Negative amount deposited in account "+myAccountNumber);
		myBalance += amount;
	}
	/**
	 * Withdras a given amount from the account
	 * @param amount Amount to withdraw
	 */
	public void withdraw(double amount){
		if((myBalance-amount)<0)throw new IllegalArgumentException("Account "+myAccountNumber+" overdrawn");
		myBalance -= amount;
	}
}
