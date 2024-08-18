package com.example.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.InternationalStudent;
import com.example.model.RegularStudent;
import com.example.model.Score;
import com.example.model.VisaInformation;

public class InternationalStudentRegisterService extends StudentRegisterService{
//	BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
	public InternationalStudentRegisterService() throws IOException {
		super();
	}
	
	@Override 
	public void getStudentInfoByType(String name,int age,Score score) throws IOException {
		System.out.print("Enter VisaType : ");
		String visaType = inputReader.readLine(); 
		System.out.print("Enter Passport : ");
		String passport = inputReader.readLine();
		VisaInformation visaInfo = new VisaInformation(visaType, passport);
		this.student = new InternationalStudent(name,age,score,visaInfo);
		this.student.addStudent(this.student);
	}
}
