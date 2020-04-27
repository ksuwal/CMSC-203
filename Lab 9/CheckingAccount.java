public class CheckingAccount extends BankAccount 
{
	
	private static final double FEE = 0.15;
	
	private String accountNumber; 
	
	
	
	public CheckingAccount(String name, double initialAmount)
	{
		super(name, initialAmount);
		
		accountNumber = super.getAccountNumber()+"-10";	
	}
	
	
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber = accountNumber +"-10";
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	
	
	public boolean withdraw(double amount)
	{
		
		return super.withdraw(amount + FEE);
	}
}