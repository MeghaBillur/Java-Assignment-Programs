package com.shristi.basic;

public class PatPyy {

	public static void main(String[] args) {
		int row=5,star=(2*row)-1,space=0;
		for(int i=1;i<=row;i++)
		{
			for(int k=1;k<=space;k++)
			{
				System.out.print(" "+" ");
			}

			for(int j=1;j<=star;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			space++;
			star=star-2;
		}
	}
}
