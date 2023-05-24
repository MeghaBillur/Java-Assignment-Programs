package com.shristi.inherdemos;

public class Savings extends Account 
{
	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public
	void withdrawl(double amount) {
		balance=balance-amount;
		System.out.println("Your amount has been Debited from Savings Account");
		System.out.println("Please Collect Your Money");
	}

	@Override
	public
	void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Your Amount has been Deposited Successfully in Savings Account");
	}
}
