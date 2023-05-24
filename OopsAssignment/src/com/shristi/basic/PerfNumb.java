package com.shristi.basic;

public class PerfNumb {
	public static void main(String[] args) {
		int num=28,sum=0,temp=num;
		
		  for(int i=1;i<=num/2;i++)
		  {
			  if(num%i==0)
			  {
				  sum=sum+i;
			  }
		  }
		if(sum==temp)
		 System.out.println(temp+" is Perfect Number");
		else
			System.out.println(temp+" is not Perfect Number");
	}
}
