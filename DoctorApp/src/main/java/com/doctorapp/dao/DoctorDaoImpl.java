package com.doctorapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DbConnection;
import com.doctorapp.util.Queries;

public class DoctorDaoImpl implements IDoctorDao {

	@Override
	public void addDoctor(Doctor doctor) {
		
			// get the connection
			Connection connection = DbConnection.openConnection();// get the connection
			// create a prepared statement
			
			try {
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.INSERTQUERY);
			//assign value for each column
			//doctorname ,specality,experience,fees,startDate,endDate
			preparedStatement.setString(1, doctor.getDoctorName());
			preparedStatement.setInt(2, doctor.getDoctorId());
			preparedStatement.setString(3,doctor.getSpecality());
			preparedStatement.setInt(4,doctor.getExperience());
			preparedStatement.setDouble(5,doctor.getFees());
			preparedStatement.setTimestamp(6,Timestamp.valueOf(doctor.getStartTime()));
			preparedStatement.setTimestamp(7, Timestamp.valueOf(doctor.getEndTime()));
			preparedStatement.execute();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		finally
		{
			DbConnection.closeConnection();
		}
		
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		Connection connection = DbConnection.openConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.UPDATEQUERY);
			preparedStatement.setDouble(1,fees);
			preparedStatement.setInt(2,doctorId);
			preparedStatement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DbConnection.closeConnection();
		}
		return doctorId;
	}

	@Override
	public Doctor findById(int doctorId) {
		List<Doctor> doctors=findAllDoctors();
		for(Doctor doctor : doctors)
		{
			if(doctor.getDoctorId().equals(doctorId))
			{
				return doctor;
			}
		}
		return null;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		Connection  connection;
		try {
			connection=DbConnection.openConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(Queries.DELETEQUERY);
			preparedStatement.setInt(1,doctorId);
			preparedStatement.execute();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DbConnection.closeConnection();
		}
	}
	@Override
	public List<Doctor> findAllDoctors() {
		Connection connection=DbConnection.openConnection();
		List<Doctor> doctors=new ArrayList<>();
		try {
		PreparedStatement preparedStatement=connection.prepareStatement(Queries.FINDALL);
		ResultSet rs=preparedStatement.executeQuery();
		while(rs.next()) {
			String doctorname=rs.getString("doctorname");
			Integer doctorId=rs.getInt("doctorId");
			String specality=rs.getString("specality");
			int experience=rs.getInt("experience");
			double fees=rs.getDouble("fees");
			LocalDateTime startTime=rs.getTimestamp("startdate").toLocalDateTime();
			LocalDateTime endTime=rs.getTimestamp("enddate").toLocalDateTime();
			Doctor doctor=new Doctor(doctorname,doctorId,specality,experience,fees,startTime,endTime);
			doctors.add(doctor);
		}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
		  DbConnection.closeConnection();
		}
		
		return doctors;
	}

	@Override
	public List<Doctor> findBySpecality(String specality) throws DoctorNotFoundException {
		try {
			Connection connection = DbConnection.openConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.QUERYBYSPECALITY);
			List<Doctor> doctors = new ArrayList<>();
			try(ResultSet rs=preparedStatement.executeQuery();){
				while(rs.next()) {
				// doctorName// doctorId// fees, speciality
				String doctorname=rs.getString("doctorname");
				int doctorId=rs.getInt("doctorId");
				String specality1=rs.getString("specality");
				// create a doctor object
				Doctor doctor=new Doctor();
				// add the doctorobject to the list
				doctors=(List<Doctor>) doctor;
				// close the while loop
				}
				// return the list- doctors
				return doctors;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
finally {
	DbConnection.closeConnection();
}
		return null;
	}

	@Override
	public List<Doctor> findBySpecalityAndExp(String specality, int experience) throws DoctorNotFoundException
	{
		// get a connection
		try {
				Connection connection = DbConnection.openConnection();
				// create a prepared statement and pass the sql
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.QUERYBYSPECALITYEXEP);
				// set the values for specilaity and exp
				preparedStatement.setString(1, specality);
				preparedStatement.setInt(2,experience);
				//create a resultset by calling executequery method
				List<Doctor> doctors = new ArrayList<>();
				// create a List<Doctor> doctors = new ArrayList<>();
				// use while rs.next
				try(ResultSet rs=preparedStatement.executeQuery();){
					while(rs.next()) {
					// doctorName// doctorId// exp, speciality
					String doctorname=rs.getString("doctorname");
					int doctorId=rs.getInt("doctorId");
					int experience1=rs.getInt("experience");
					String specality1=rs.getString("specality");
					// create a doctor object
					Doctor doctor=new Doctor();
					// add the doctorobject to the list
					doctors=(List<Doctor>) doctor;
					// close the while loop
					}
					// return the list- doctors
					return doctors;
				}
		}
		catch (SQLException e) {
					e.printStackTrace();
				}
		finally {
			DbConnection.closeConnection();
		}
		
	return null;
	}
	@Override
	public List<Doctor> findBySpecalityAndFees(String specality, double fees) throws DoctorNotFoundException 
	{
		try {
			Connection connection = DbConnection.openConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.QUERYBYSPECALITYEES);
			List<Doctor> doctors = new ArrayList<>();
			try(ResultSet rs=preparedStatement.executeQuery();){
				while(rs.next()) {
				// doctorName// doctorId// fees, speciality
				String doctorname=rs.getString("doctorname");
				int doctorId=rs.getInt("doctorId");
				double feess=rs.getDouble("feess");
				String specality1=rs.getString("specality");
				// create a doctor object
				Doctor doctor=new Doctor();
				// add the doctorobject to the list
				doctors=(List<Doctor>) doctor;
				// close the while loop
				}
				// return the list- doctors
				return doctors;
			}
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DbConnection.closeConnection();
		}
		return null;
	}
}
