package com.simeio.employee;

public class Emplyee {
	String name;
	String city;
	int empid;
	public Emplyee(String name, String city, int empid) {
		super();
		this.name = name;
		this.city = city;
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Emplyee [name=" + name + ", city=" + city + ", empid=" + empid + "]";
	}
	
	

}
