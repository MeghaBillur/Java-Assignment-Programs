package com.shristi.basic;

public class SecLarArr {
	public static void main(String[] args) {
		int[] arr= {10,50,70,66,3,5,44};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Array After Sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Second Largest Value in an Array "+ arr[arr.length-2]);
		
	}

}
