package com.shristi.absdemos;

public abstract class Bank {
	double balance;
	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	abstract void withdrawl(double amount);
	abstract void deposit(double amount);
	double getbalance() {
		return balance;
	}

}