package com.shristi.basic;

public class SumAvgArr {
	public static void main(String[] args) {
		int[] arr= {10,50,50,70,66,3,3,5,44};
		int sum=0,avg=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of an array is "+sum);
		avg=sum/arr.length;
		System.out.println("Average of an array is "+avg);
		
	}

}
