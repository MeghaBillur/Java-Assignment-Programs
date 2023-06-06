package com.shristi.autowrite;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext
				("com.shristi.autowrite");
		Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
		
		//for autowiring 
		Performer performer=new Performer();
		performer.playSong("G","Johny Jhony Yes Pappa");
	}

}
