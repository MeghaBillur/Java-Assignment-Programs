package com.mobileapp.model;

public class Mobile {
	String model;
	double price;
	String brand;
	int  mobileid;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	@Override
	public String toString() {
		return "Mobile [model=" + model + ", price=" + price + ", brand=" + brand + ", mobileid=" + mobileid + "]";
	}
	public Mobile(String model, double price, String brand, int mobileid) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
		this.mobileid = mobileid;
	}
	

}
