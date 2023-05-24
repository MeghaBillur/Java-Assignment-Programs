package com.shristi.basic;

public class PatPyramid {
	public static void main(String[] args) {
		int row=5,star=1,space=row-1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			space--;
			star=star+2;
		}
	}

}
