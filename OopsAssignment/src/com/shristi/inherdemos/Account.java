package com.shristi.inherdemos;

public class Account {
double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	void withdrawl(double amount)
	{
		System.out.println("Account withdrawl");
	}
	void deposit(double amount)
	{
		System.out.println("Account withdrawl");
	}
	public double getbalance()
	{
		return balance;
	}

}
