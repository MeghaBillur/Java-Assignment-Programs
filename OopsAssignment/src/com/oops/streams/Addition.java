package com.oops.streams;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Addition {
	public static void main(String[] args) {
		System.out.println("........Consumer.........");
		Consumer<Integer>  consumer=(number)->System.out.println(number+number);
		consumer.accept(5);
		
		System.out.println("........BiConsumer.........");
		BiConsumer<Integer, Integer> biConsumer=(num1,num2)->System.out.println(num1+num2);
		biConsumer.accept(50,30);
	}

}
