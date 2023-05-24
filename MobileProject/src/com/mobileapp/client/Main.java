package com.mobileapp.client;

import java.util.Scanner;

import com.mobileapp.exception.MobileNotFounfException;
import com.mobileapp.model.Mobile;
import com.mobileapp.service.MobileService;
import com.mobileapp.service.MobileServiceImpl;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			MobileService mobileService = new MobileServiceImpl();
			System.out.println("Enter The Mobile Id to get the Details");
			int mobileId = sc.nextInt();
			System.out.println(mobileService.getById(mobileId));

			System.out.println();
			System.out.println("Getting All the Details of Mobile");
			Mobile[] mobiles = mobileService.getAll();
			for (Mobile mobile : mobiles) {
				System.out.println(mobile);
			}
			System.out.println("Enter the Brand to get Details");
			String brand = sc.next();
			Mobile[] mobilebrand = mobileService.getByBrand(brand);
			System.out.println("Mobile By Brand are");
			for (Mobile mobilebybrand : mobilebrand) {
				System.out.println(mobilebybrand);
			}
		} catch (MobileNotFounfException e) {
			System.out.println(e.getMessage());
		}
	}
}
