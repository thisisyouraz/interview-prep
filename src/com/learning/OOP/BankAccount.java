package com.learning.OOP;

public class BankAccount
{
	private String accountName;
	private double balance;
	private String accountNumber;
	private String email;
	private String phone;

	public String getAccountName()
	{
		return accountName;
	}

	public void setAccountName(String accountName)
	{
		this.accountName = accountName;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public String getAccountNumber()
	{
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public void withDrawAmount(long amount)
	{
		if (balance - amount < 0)
		{
			System.out.println("Insufficient balance, you have $" + balance);
		}

		balance = balance - amount;
		System.out.println("you account debited by $" + amount + ", your new balance is $" + balance);
	}

	public void depositAmount(long amount)
	{
		balance = balance + amount;
		System.out.println("dear " + accountName + ", you account is credited by $" + amount + " Your new balance is $" + balance);
	}
}
