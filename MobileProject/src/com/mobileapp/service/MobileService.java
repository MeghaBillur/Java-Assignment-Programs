package com.mobileapp.service;

import com.mobileapp.exception.MobileNotFounfException;
import com.mobileapp.model.Mobile;
public interface MobileService {
	
	Mobile[] getAll();
	Mobile[] getByBrand(String brand) throws MobileNotFounfException;
	Mobile getById(int id) throws MobileNotFounfException;
}
