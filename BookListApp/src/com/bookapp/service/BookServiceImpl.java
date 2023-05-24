package com.bookapp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService 
{

	BookDetails bookDetails=new BookDetails();
	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		List<Book> book=bookDetails.showBooks();
		return book;
		
	}

	@Override
	public List<Book> getByAuthor(String author) {
		List<Book> books=bookDetails.showBooks();
		List<Book> booksbyauthor=books.stream()
				.filter(book->book.getAuthor().equals(author))
				.collect(Collectors.toList());
		return booksbyauthor;
	}
	@Override
	public List<Book> getByCategory(String category) {
		List<Book> books=bookDetails.showBooks();
		List<Book> booksbycategory=books.stream()
				.filter(book->book.getCategory().equals(category))
				.collect(Collectors.toList());
		return booksbycategory;
	}
	@Override
	public Optional<Book> getById(int bookId) {
		List<Book> books=bookDetails.showBooks();
		Optional<Book> booksbyid=books.stream()
				.filter(book->((Integer)book.getBookId()).equals((Integer)bookId))
				.findAny();
		return booksbyid;
	}
}
