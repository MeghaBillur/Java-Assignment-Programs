package com.shristi.basic1;

import java.util.Scanner;

public class smaThreShCirAnd {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter Three Values");
		int x,y,z;
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x<y && x<z)
			System.out.println(x+" is Smaller");
		else if(y<z)
			System.out.println(y+" is Smaller");
		else
			System.out.println(z+" is Smaller");
	}

}
