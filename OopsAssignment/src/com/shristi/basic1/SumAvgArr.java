package com.shristi.basic1;

import java.util.Scanner;

public class SumAvgArr {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter Array Elements");
		for(int i=1;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
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
