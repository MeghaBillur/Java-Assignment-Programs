package com.oops.streams;
import java.util.function.Supplier;
public class StringToUpperCase {
	public static void main(String[] args) {
		System.out.println("***********SUPPLIER***************");
		Supplier<String> supplier=()->"Hello".toUpperCase();
		System.out.println(supplier.get());
	}
}
