package com.shristi.auto;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shristi.autowrite.Performer;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext
				("com.shristi.autowrite");
		Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
		
		//for autowiring 
		Resturant resturant=new Resturant();
		System.out.println(resturant.dispalyMenu("C"));
	}

}
