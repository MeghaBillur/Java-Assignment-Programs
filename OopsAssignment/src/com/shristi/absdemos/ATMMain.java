package com.shristi.absdemos;
import java.util.Scanner;
import com.shristi.inherdemos.Current;
import com.shristi.inherdemos.Savings;
public class ATMMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ATM Machine");
		int withdraw,getbalance=100000,deposit;
		String type = null;
		Current current=new Current(getbalance);
		Savings savings=new Savings(getbalance);
			System.out.println("Enter the Option you want to Perform");
			System.out.println("1 : Withdraw");
			System.out.println("2 : Deposit");
			System.out.println("3 : Getbalance");
			System.out.println("4 : Exit");
			int choice=sc.nextInt();
			double x;
			switch (choice) {
			case 1:
				System.out.println("Enter the type of Account");
				type=sc.next();
				System.out.println("Enter the Money to Withdraw");
				withdraw=sc.nextInt();
				if(type.equals("Current"))
					current.withdrawl(withdraw);
				else if(type.equals("Savings"))
					savings.withdrawl(withdraw);
				break;
			case 2:
				System.out.println("Enter the type of Account");
				type=sc.next();
				System.out.println("Enter the Money to Deposit");
				deposit=sc.nextInt();
				if(type.equals("Current"))
					current.deposit(deposit);
				else if(type.equals("Savings"))
					savings.deposit(deposit);
				break;
			case 3:
				System.out.println("Enter the type of Account");
				type=sc.next();
				if(type.equals("Current")) {
					 getbalance=(int) current.getbalance();
					System.out.println("Your Balance is "+getbalance);}
				else if(type.equals("Savings")) {
					getbalance=(int) savings.getbalance();
					System.out.println("Your Balance is "+getbalance);}
				break;
			default :
				System.out.println("You Entered Wrong Option");
		}
			System.out.println();
			System.out.println();
	}}

