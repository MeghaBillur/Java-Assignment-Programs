package com.voterapp.main;
import java.util.Scanner;

import com.voterapp.exception.ElectionBooth;
import com.voterapp.exception.ElectionBoothImpl;
import com.voterapp.service.InValidVoterException;
public class Voter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Wel Come to Election Booth");
		System.out.println("Enter Your age");
		int age=sc.nextInt();
		System.out.println("Enter Your Locality");
		String locality=sc.next();
		System.out.println("Enter Your Vid");
		int vid=sc.nextInt();
		try {
		ElectionBooth booth=new ElectionBoothImpl();
				boolean result=booth.checkEligibility(age,locality,vid);
				if(result) {
					System.out.println("You are Eligible to Vote");
				}
			}
		catch (InValidVoterException e) {
			System.out.println(e.getMessage());
		}
	}
}
