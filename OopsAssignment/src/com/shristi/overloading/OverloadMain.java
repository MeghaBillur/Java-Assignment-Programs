package com.shristi.overloading;
import java.util.Scanner;
public class OverloadMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name");
		String employeeName=sc.next();
		System.out.println("Enter Designation");
		String designation=sc.next();
		Employee employee=new Employee("Megha","Manager");
		Employee employee2=new Employee("Pooja","Programmer");
		Employee employee3=new Employee("Laxmi","Director");
		if(designation.equals("Programmer"))
		{
			double x=employee2.calcBonus(2000);
			System.out.println(x);
		}
		else if(designation.equals("Manager"))
		{
			double x1=employee.calcBonus(10000, 75555);
			System.out.println(x1);
		}
		else if(designation.equals("Director"))
		{
			double x2=employee3.calcBonus(1203, 4057, 4023);
			System.out.println(x2);
		}
	}
}
