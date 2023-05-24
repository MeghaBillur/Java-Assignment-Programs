package com.shristi.basic1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		String[] arr= {"Megha","Pooja","Ravi","Rahul"};
		System.out.println("Enter Username to Login");
		String username=sc.next();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(username))
			{
				System.out.println("You are Logged in Successfully");
				break;
			}
			else
			{
				System.out.println("Invalid Username");
				break;
			}
		}
	}

}
