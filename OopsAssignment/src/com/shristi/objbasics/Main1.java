package com.shristi.objbasics;

import java.util.Scanner;

public class Main1 {
public static void main(String[] args) {
	String name;
	int id;
	int[] marks=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Student Details");
	System.out.println("Name :");
	name=sc.next();
	System.out.println("Id :");
	id=sc.nextInt();
	System.out.println("Marks");
	for(int i=0;i<5;i++)
	{
		marks[i]=sc.nextInt();
	}
	Student student=new Student("Megha","CSE");
	student.printDetails();
	String result=student.getGrades(marks);
	System.out.println("Result :"+result);

}
}
