package com.doctorapp.util;
public class Queries {
	public static final String CREATEQUERY =
			"create table DOCTORR(doctorname varchar(20),doctorId number primary key,"
			+ "specality varchar(20),experience number,fees REAL,startDate timestamp,endDate timeStamp)";
	public static final String INSERTQUERY =
			"insert into DOCTORR(doctorname,doctorId,specality,experience,fees,startDate,endDate) "
			+ "values(?,?,?,?,?,?,?)";
	public static final String UPDATEQUERY =
			"update DOCTORR set fees=? where doctorId=?";
	public static final String QUERYBYID ="";
	public static final String QUERYBYSPECALITY ="select doctorname,doctorId,specality,fees from DOCTORR where"
			+ "specality=?";
	public static final String QUERYBYSPECALITYEXEP ="select doctorname,doctorId,specality,fees,exeprience "
			+ "from doctor where specality=?,exep=?";
	public static final String QUERYBYSPECALITYEES ="select doctorname,doctorId,specality,fees,exeprience "
			+ "from doctor where specality=?,fees=?";
	public static final String DELETEQUERY ="delete  from DOCTORR where doctorId=?";
	public static final String FINDALL ="SELECT * FROM DOCTORR";
	
}
