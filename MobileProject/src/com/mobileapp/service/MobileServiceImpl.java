package com.mobileapp.service;

import com.mobileapp.exception.MobileNotFounfException;
import com.mobileapp.model.Mobile;

public class MobileServiceImpl implements MobileService{

	@Override
	public Mobile getById(int id) throws MobileNotFounfException {
		Mobile[] mobiles=allMobiles();
		int count=0;
		for (Mobile mobile : mobiles) {
			if(mobile.getMobileid()==id)
			{
				count++;
				return mobile;
			}
		}
		if(count==0)
			throw new MobileNotFounfException("Mobile is Not found");
		return null;
	}

	@Override
	public Mobile[] getByBrand(String brand) throws MobileNotFounfException {
		Mobile[] mobiles=allMobiles();
		int count=0;
		for (Mobile mobile : mobiles) {
			if(mobile.getBrand().equals(brand))
				count++;
		}
		 Mobile[] getbybrand=new Mobile[count];
		if(count>0) {
		   
		   int j=0;
		   for(int i=0;i<mobiles.length;i++)
		   {
			if(mobiles[i].getBrand().equals(brand)) {
				getbybrand[j]=mobiles[i];
				j++;
			}
		   }
		   			
		  }
		else
			throw new  MobileNotFounfException("Mobile is Not found");
		return getbybrand;
	}

	@Override
	public Mobile[] getAll() {
		Mobile[] mobiles=allMobiles();
		
		return mobiles;
	}

	private Mobile[] allMobiles()
	{
		Mobile[] mobiles=new Mobile[7];
		mobiles[0]=new Mobile("MVU",25998,"Oppo", 7);
		mobiles[1]=new Mobile("ABC",18000,"Samsung", 8);
		mobiles[2]=new Mobile("MVU",3000,"Oppo", 17);
		mobiles[3]=new Mobile("XYZ",5889,"Oppo", 3);
		mobiles[4]=new Mobile("MVU",6000,"Samsung", 2);
		mobiles[5]=new Mobile("MMM",39000,"Oppo", 6);
		mobiles[6]=new Mobile("XCV",1000,"Samsung",5);
		return mobiles;
 	}
}
