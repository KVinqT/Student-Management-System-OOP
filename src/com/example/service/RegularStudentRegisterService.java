package com.example.service;

import java.io.IOException;

import com.example.dao.StudentDaoImp;
import com.example.model.RegularStudent;

public class RegularStudentRegisterService extends StudentRegisterService{	

	public RegularStudentRegisterService() throws IOException {
		super();
	}
	
	@Override 
	public void getStudentInfoByType(String name,int age) throws IOException {
		System.out.println("Enter nrc number: ");
		String nrcNumber = inputReader.readLine();
		this.student = new RegularStudent(name,age,nrcNumber);
		BaseServices.studentDao.addStudent(this.student);
	}
}
