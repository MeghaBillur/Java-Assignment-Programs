package com.doctorapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import com.doctorapp.dao.IDoctorDao;
import com.doctorapp.dao.DoctorDaoImpl;
import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DbConnection;
import com.doctorapp.util.Queries;

public class DoctorServiceImpl implements IDoctorService {

	IDoctorDao dao = new DoctorDaoImpl();

	@Override
	public void addDoctor(Doctor doctor) {
		dao.addDoctor(doctor);
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		int result = dao.updateDoctor(doctorId, fees);
		if (result == 0)
			throw new ArithmeticException();
		return result;
	}

	@Override
	public Doctor getById(int doctorId) {
		return dao.findById(doctorId);
		
	}

	@Override
	public void deleteDoctor(int doctorId) {
		dao.deleteDoctor(doctorId);

	}

	@Override
	public List<Doctor> getAllDoctors() {
		return  dao.findAllDoctors();
		
	}

	@Override
	public List<Doctor> geBySpecality(String specality) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		List<Doctor> doctorsBySpe=dao.findBySpecality(specality);
		if(doctorsBySpe.isEmpty())
			throw new  DoctorNotFoundException();
		return doctorsBySpe;
	}

	@Override
	public List<Doctor> getBySpecalityAndExp(String specality, int experience) throws DoctorNotFoundException {
		List<Doctor> doctorsBySpecExp = dao.findBySpecalityAndExp(specality, experience);
		// check if list ie empty if so throw exception
		if (doctorsBySpecExp.isEmpty())
			throw new DoctorNotFoundException();

		// get the doctors convert to stream sort the doctor by name and return the list
		return doctorsBySpecExp;
	}

	@Override
	public List<Doctor> getBySpecalityAndFees(String specality, double fees) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		List<Doctor> doctorsBySpeFees = dao.findBySpecalityAndFees(specality,fees);
		// check if list ie empty if so throw exception
		if (doctorsBySpeFees.isEmpty())
			throw new DoctorNotFoundException();
		return doctorsBySpeFees;
	}
}
