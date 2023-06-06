package com.doctorapp.model;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Doctor {
   	private String doctorName;
   	private Integer doctorId;
   	private String specality;
   	private double fees;
   	private int experience;
   	private LocalDateTime startTime;
   	private LocalDateTime endTime;
	public Doctor(String doctorName, Integer doctorId, String specality, int experience,double fees,
			LocalDateTime startTime, LocalDateTime endTime) {
		super();
		this.doctorName = doctorName;
		this.doctorId = doctorId;
		this.specality = specality;
		this.fees = fees;
		this.experience = experience;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public String getSpecality() {
		return specality;
	}
	public void setSpecality(String specality) {
		this.specality = specality;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", doctorId=" + doctorId + ", specality=" + specality + ", fees="
				+ fees + ", experience=" + experience + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
}
