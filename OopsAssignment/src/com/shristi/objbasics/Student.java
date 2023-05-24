package com.shristi.objbasics;
public class Student {
	private String name;
	private String department;
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	void printDetails()
	{
		System.out.println("Name "+name);
		System.out.println("Department "+department);
	}
	String getGrades(int[] marks)
	{
		int sum1=0,avg=0;
		String grade;
		for(int i=0;i<marks.length;i++)
		{
			sum1=sum1+marks[i];
		}
		avg=sum1/marks.length;
		if(avg>=85 && avg<=100)
			grade="A";
		else if(avg>=50 && avg<=85)
			grade="B";
		else if(avg>=35 && avg<=50)
			grade="C";
		else
			grade="fail";
		return grade;
	}
}
