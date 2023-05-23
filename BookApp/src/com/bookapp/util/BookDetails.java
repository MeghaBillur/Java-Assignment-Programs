package com.bookapp.util;

import com.bookapp.model.Book;

public class BookDetails {
	public Book[] showBooks()
	{
		Book[]  books=new Book[5];
		books[0]=new Book("Java","kathy",1,800,"Tech");
		books[1]=new Book("Python","John",2,800,"Tech");
		books[2]=new Book("Life After Life","Robert",3,8500,"History");
		books[3]=new Book("Leadership","Jinal",4,1800,"true story");
		books[4]=new Book("5amclub","harry",5,400,"inspirational");
		return books;
	}

}
