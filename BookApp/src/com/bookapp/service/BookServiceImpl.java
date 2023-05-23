package com.bookapp.service;

import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService 
{

	@Override
	public Book[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book[] getByAuthor(String author) {
		Book[] books=BookDetails.ShowBooks();
		return null;
	}

	@Override
	public Book[] getByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
