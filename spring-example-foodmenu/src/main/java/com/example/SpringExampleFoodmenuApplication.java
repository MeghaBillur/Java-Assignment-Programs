package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringExampleFoodmenuApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleFoodmenuApplication.class, args);
	}

	@Autowired
	private Resturant resturant;


	@Override
	public void run(String... args) throws Exception {
		resturant.dispalyMenu("I").forEach(System.out::println);
	}

}
