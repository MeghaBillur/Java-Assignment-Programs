package com.shristi.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component("continental")
public class Continental implements IFoodMenu{

	@Override
	public List<String> showItem() {
	List<String> continenatldishes=Arrays.asList("Bread","Sandwitc","Pancake");
	System.out.println("Continental Iteams");
		return continenatldishes;
	}

}
