package com.simeio.employee;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class EmpMain {
	public static void main(String[] args) {
		List<Emplyee> emplyees=Arrays.asList(
				new Emplyee("John","Ban",2),
				new Emplyee("Jack","Hubli",3),
				new Emplyee("Harry","Ban",7),
				new Emplyee("Kady","Hubli",6),
				new Emplyee("Mani","Bgm",9)
				);
		
		System.out.println("Printing all employees");
		for (Emplyee emplyee : emplyees) {
			System.out.println(emplyee);
			
		}
		System.out.println("Printing Employees based onCity-Stream,filter,foreach");
		String city="Ban";
		
		List<Emplyee> emplyees2=emplyees.stream()
				.filter(str->str.getCity().equals(city))
				.collect(Collectors.toList());
		emplyees2.forEach(str->System.out.println(str));
			
		System.out.println("Printing All Employees after sorting-Stream,,sorted(lambda Expression),foreach");
		List<Emplyee> emplyees3=emplyees.stream()
				.sorted((o1,o2)->o1.compareTo(o2))
				.collect(Collectors.toList());
		emplyees3.forEach(str->System.out.println(str));

			
		}
	}
