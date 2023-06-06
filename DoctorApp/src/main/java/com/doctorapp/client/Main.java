package com.doctorapp.client;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.IDoctorService;
import com.doctorapp.service.DoctorServiceImpl;

public class Main {
	public static void main(String[] args) {
		LocalDateTime startTime=LocalDateTime.of(2022,9,23,11,00);
		LocalDateTime endTime=LocalDateTime.of(2022,9,23,05,00);
		Scanner scanner=new Scanner(System.in);
		
		Doctor doctor=new Doctor();
		IDoctorService doctorService=new DoctorServiceImpl();
		System.out.println(doctorService.updateDoctor(10, 12000));
	}

}
