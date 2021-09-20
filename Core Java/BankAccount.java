package bank;

import java.util.Scanner;

class BankAccount1 {
	private String accountName="pooja";
	private int accountNumber=1234;
	int balance;
	BankAccount1(int accountNumber,String accountName)
	{
		this.accountNumber=accountNumber;
		this.accountName=accountName;
	}
	/*public BankAccount1()
	{
		balance=0;
	}*/
	public String getAccountName() {
		return accountName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public int getBalance()
	{
		return balance;
	}
	public void deposit(double amount)
	{
		balance+=amount;
	}
	public void withdraw(double amount)
	{
		balance-=amount;
	}
	public void transfer(double amount)
	   {  
       withdraw(amount);
	       //other.deposit(amount);
	    }
}
class SavingsAccount extends BankAccount1{
		
	double interestRate;
	SavingsAccount(int accountNumber,String accountName,double rate)
	{
		super(accountNumber,accountName);
		interestRate=rate;
		System.out.println("interestRate"+interestRate);
	}
	public void addInterest()
	{
		this.balance=(int) (this.balance+(this.balance/100*interestRate));
	}
	
	
	
}
class BankAccount{
	

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		SavingsAccount b=new SavingsAccount(20120,"pratiksha somnath doke",10);
		b.deposit(500);
		//b.deposit(1500);
		
		System.out.println("before balance interest is" +b.getBalance());
		//b.withdraw(400);
		b.addInterest();
		System.out.println("after  balance interest is" +b.getBalance());
	}
}
