package com.shristi.basic;

public class ArmStrong {
	public static void main(String[] args) {
	int n=153;
	int temp=n,extra=n;
	int count=0;
	int sum=0;
	while(n>0)
	{
		n=n/10;
		count++;
	}
	System.out.println(count);
	
	while(temp>0)
	{
		int rem=temp%10;
		sum=sum+(int) Math.pow(rem,count);
		temp=temp/10;
	}
	System.out.println(sum);
	if(sum==extra)
		System.out.println(extra+" is Arm strong Number");
	else
		System.out.println(extra+" is not Arm strong Number");
	}
	
	}

