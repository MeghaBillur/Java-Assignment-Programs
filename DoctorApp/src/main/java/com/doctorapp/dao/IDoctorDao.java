package com.doctorapp.dao;

import java.util.List;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorDao {
	void addDoctor(Doctor doctor);
	int updateDoctor(int doctorId,double fees);
	Doctor findById(int doctorId);
	void deleteDoctor(int doctorId);
	List<Doctor> findAllDoctors();
	
	List<Doctor> findBySpecality(String specality) throws DoctorNotFoundException;
	List<Doctor> findBySpecalityAndExp(String specality,int experience) throws DoctorNotFoundException;
	List<Doctor> findBySpecalityAndFees(String specality,double fees) throws DoctorNotFoundException;

}
