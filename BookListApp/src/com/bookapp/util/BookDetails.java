package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	public List<Book> showBooks()
	{
		List<Book>  books=Arrays.asList(
		new Book("Java","kathy",1,800,"Tech"),
		new Book("Python","kathy",2,800,"Tech"),
		new Book("Life After Life","Robert",3,8500,"History"),
		new Book("Leadership","Jinal",4,1800,"true story"),
		new Book("5amclub","harry",5,400,"inspirational"));
		
	return books;
	}
}
