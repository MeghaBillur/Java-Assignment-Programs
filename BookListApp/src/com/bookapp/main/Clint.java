package com.bookapp.main;
import java.util.List;
import java.util.Scanner;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;
import com.bookapp.util.BookDetails;
public class Clint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IBookService bookService=new BookServiceImpl();
		System.out.println("Enter Author Name to get Details");
		String author=sc.next();
		List<Book> books=bookService.getByAuthor(author);
		for (Book book : books) {
			System.out.println(books);
		}
		System.out.println();
	    System.out.println("Enter Category to get Details");
	    String category=sc.next();
	   System.out.println(bookService.getByCategory(category));
	    System.out.println();
	    System.out.println("enter Id to get Details");
	    int id=sc.nextInt();
	    System.out.println(bookService.getById(id));
	    System.out.println();
	    System.out.println("Printing all the details of Books...");
	    System.out.println(bookService.getAll());
	}
	}

