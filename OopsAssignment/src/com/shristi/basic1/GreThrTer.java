package com.shristi.basic1;

import java.util.Scanner;

public class GreThrTer {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter Three Values");
		int x,y,z;
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		int a=x>y&&x>z?x:y>z?y:z;
		System.out.println(a+" is Geater");
	}

}
