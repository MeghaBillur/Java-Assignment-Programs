package com.shristi.basic;

public class DupArr {
	public static void main(String[] args) {
	int[] arr= {10,50,50,70,66,3,3,5,44};
	System.out.println("Duplicate Values count in an Array");
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
			}
		}
	}
	System.out.println(count);

	}
}
