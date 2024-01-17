package com.learning.OOP;

public class Customer
{
	private String name;
	private double creditLimit;
	private String emailAddress;

	public Customer()
	{
		this("default name", "default-email");
	}
	public Customer(String name, String emailAddress)
	{
		this(name, 9999.0, emailAddress);
	}
	public Customer(String name, double creditLimit, String emailAddress)
	{
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}



	public String getName()
	{
		return name;
	}
	public String getEmailAddress()
	{
		return emailAddress;
	}
	public double getCreditLimit()
	{
		return creditLimit;
	}
}
