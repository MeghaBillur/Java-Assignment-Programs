package com.doctorapp.client;
import java.time.LocalDateTime;
import java.util.List;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.service.IDoctorService;
import com.doctorapp.service.DoctorServiceImpl;
public class Admin {
public static void main(String[] args) {
	Doctor doctor=new Doctor();
	doctor.setDoctorId(3);
	doctor.setDoctorName("Virat");
	doctor.setExperience(10);
	doctor.setFees(6000);
	doctor.setSpecality("neurology");
	doctor.setStartTime(LocalDateTime.parse("2023-06-01T11:45:40"));
	doctor.setEndTime(LocalDateTime.parse("2023-06-01T11:50:40"));
	IDoctorService doctorService=new DoctorServiceImpl();
//	doctorService.addDoctor(doctor);
//	doctorService.updateDoctor(3,5000);
//	
//	List<Doctor> doctorlist=doctorService.getAllDoctors();
//	//print the same doctors as output for specality
//	doctorlist.stream().forEach(System.out::println); 
//	System.out.println(doctorService.getById(2));
//	doctorService.deleteDoctor(3);
	List<Doctor> geBySpecality;
	try {
		geBySpecality = doctorService.geBySpecality("cardiology");
		geBySpecality.stream().forEach(System.out::println);
	} catch (DoctorNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

