package com.shristi.basic1;

import java.util.Scanner;

public class PaliNum {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int temp=num,sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println("Number after Reversing "+sum);
		if(sum==temp)
			System.out.println(temp+" is Palindrome");
		else
			System.out.println(temp+" is not Palindrome");
	}

}
