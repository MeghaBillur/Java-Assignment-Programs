package com.shristi.basic1;

import java.util.Scanner;

public class SqrtArr {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Values");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Square Root of New Array Values");
		int arr1[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr1[i]=(int) Math.sqrt(arr[i]);
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr1[i]);
		}
		
	}
}
