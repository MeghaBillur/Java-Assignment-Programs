package com.shristi.auto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Resturant {
	@Autowired
	IFoodMenu chinese;
	@Autowired
	IFoodMenu continental;
	@Autowired
	IFoodMenu indian;
  public List<String> dispalyMenu(String choice){
	  List<String> list=new ArrayList<>();
		if(choice.equalsIgnoreCase("C"))
			list=chinese.showItem();
		if(choice.equals(choice.equalsIgnoreCase("Co")))
			list=continental.showItem();
		if(choice.equals(choice.equalsIgnoreCase("I")))
				list=indian.showItem();
		return list;
		
		
	}

}
