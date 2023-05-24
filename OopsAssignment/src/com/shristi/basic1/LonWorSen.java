package com.shristi.basic1;
import java.util.Scanner;
public class LonWorSen {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		String str="Megha Billur started working in Simeio";
		String[] arr=str.split(" ");
		String longword=" ";
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
				if(arr[i].length()>arr[j].length())
					longword=arr[i];
			System.out.println(longword+" is the Longest word in a Senteance ");	
		}
	}


