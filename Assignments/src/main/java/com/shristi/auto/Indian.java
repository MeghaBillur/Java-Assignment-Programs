package com.shristi.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component("indian")
public class Indian implements IFoodMenu{

	@Override
	public List<String> showItem() {
		List<String> indianldishes=Arrays.asList("Dosa","Puri","Idli");
		System.out.println("Continental Iteams");
		return indianldishes;
	}

}
