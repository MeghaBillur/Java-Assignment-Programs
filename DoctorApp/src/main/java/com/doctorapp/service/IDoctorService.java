package com.doctorapp.service;

import java.util.List;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorService {
	void addDoctor(Doctor doctor);
	int updateDoctor(int doctorId,double fees);
	Doctor getById(int doctorId);
	void deleteDoctor(int doctorId);
	List<Doctor> getAllDoctors();
	
	List<Doctor> geBySpecality(String specality) throws DoctorNotFoundException;
	List<Doctor> getBySpecalityAndExp(String specality,int experience) throws DoctorNotFoundException;
	List<Doctor> getBySpecalityAndFees(String specality,double fees) throws DoctorNotFoundException;
}
