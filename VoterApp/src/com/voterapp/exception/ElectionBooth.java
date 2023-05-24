package com.voterapp.exception;

import com.voterapp.service.InValidVoterException;

public interface ElectionBooth {
	public boolean checkEligibility(int age, String locality, int vid) throws InValidVoterException;

}
