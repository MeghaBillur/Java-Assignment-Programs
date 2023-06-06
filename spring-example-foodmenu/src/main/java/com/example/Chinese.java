package com.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Chinese implements IFoodMenu{

	@Override
	public List<String> showItem() {
		List<String> chineseldishes=Arrays.asList("GobiManchuri","Fried Rice","Noodles");
		System.out.println("Chinese Iteams");
		return chineseldishes;
	}

}
