public class SavingsAccount extends BankAccount
{
	
	
	private double rate = 2.5;
	private int savingsNumber = 0;
	
	private String accountNumber;
	
	public SavingsAccount(String ownerName, double initialAmount)
	{
		super(ownerName, initialAmount);
		accountNumber = super.getAccountNumber()+"-" + savingsNumber;
	}
	

	public void postInterest()
	{
		double interest = getBalance() * rate / 100 / 12;
		deposit(interest);
	}
	
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
		public SavingsAccount(SavingsAccount oldAccount, double initialAmount)
	{
		super(oldAccount, initialAmount);
		

		savingsNumber++;
		accountNumber = super.getAccountNumber()+"-" + savingsNumber;
	}
	
}
