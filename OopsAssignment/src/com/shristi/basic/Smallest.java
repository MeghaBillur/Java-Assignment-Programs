package com.shristi.basic;

public class Smallest {
	public static void main(String[] args) {
		int[] arr= {10,20,30};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<arr[i+1]&& arr[i]<i+2)
			 System.out.println(arr[i]+"is Smallest");
			else if(arr[i+1]<arr[arr.length-1])
				System.out.println(arr[i+1]+"is Smallest");
			else
				System.out.println(arr[i+2]+"is Smallest");
		}
	}

}
