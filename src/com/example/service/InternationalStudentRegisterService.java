package com.example.service;

import java.io.IOException;

import com.example.model.InternationalStudent;
import com.example.model.VisaInformation;

public class InternationalStudentRegisterService extends StudentRegisterService{
	public InternationalStudentRegisterService() throws IOException {
		super();
	}
	
	@Override 
	public void getStudentInfoByType(String name,int age) throws IOException {
		System.out.print("Enter VisaType : ");
		String visaType = inputReader.readLine(); 
		System.out.print("Enter Passport : ");
		String passport = inputReader.readLine();
		VisaInformation visaInfo = new VisaInformation(visaType, passport);
		this.student = new InternationalStudent(name,age,visaInfo);
		BaseServices.studentDao.addStudent(this.student);
	}
}
