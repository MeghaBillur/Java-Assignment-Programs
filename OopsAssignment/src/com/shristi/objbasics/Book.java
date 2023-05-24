package com.shristi.objbasics;

public class Book {
	private String title;
	private String author;
	private double price;
	private String category;
	public Book(String title, String author, double price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	void getDetails()
	{
		System.out.println("Title "+title);
		System.out.println("Author "+author);
		if(price>500)
			System.out.println("Premium Books");
		else
			System.out.println("Standard Books");
		System.out.println("Category "+category);
	}
	
	

}
