package com.shristi.basic;

public class RevNumArr {
	public static void main(String[] args) {
		int[] arr= {1045,500457,879};
		System.out.println("Reversed Values in an array");
		for(int i=0;i<arr.length;i++)
		{
		int num=arr[i];
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println(rev);
		}
	}

}
