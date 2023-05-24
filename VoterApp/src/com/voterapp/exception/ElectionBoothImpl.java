package com.voterapp.exception;
import com.voterapp.service.InValidVoterException;
import com.voterapp.service.LocalityNotFoundException;
import com.voterapp.service.NoVoterIdException;
import com.voterapp.service.UnderAgeException;

public class ElectionBoothImpl implements ElectionBooth{

	@Override
	public boolean checkEligibility(int age, String locality, int vid) throws InValidVoterException
	{
		boolean resage=checkAge(age);
			if(resage==true)
			{
				boolean reslocality=checkLocality(locality);
				if(reslocality==true)
				{
					boolean resvid=checkVoterId(vid);
					if(resvid==true)
						return true;
					else 
						return false;
				}
				else
					return false;
			}
			else
				return false;
		}
		private boolean checkAge(int age) throws UnderAgeException {
		if(age<=18)
			throw new UnderAgeException("U are under age to vote");
		return true;
	}
	
		private boolean checkLocality(String locality) throws LocalityNotFoundException
		{
		String[] localities= {"Ban","Hubli","Bgk"};
		for (String string : localities) {
			if(localities.equals(locality))
			{
				throw new LocalityNotFoundException("Your locality is not Matching");
			}
		}
		return true;
		}
		private boolean checkVoterId(int vid)throws NoVoterIdException
		{
		if(vid>=1000 && vid<9999)
		{
		}		
		else
			throw new NoVoterIdException("Your Voter Id is not in Range");
		return true;
	}
}

