package com.example.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.RegularStudent;
import com.example.model.Score;

public class RegularStudentRegisterService extends StudentRegisterService{	
	public RegularStudentRegisterService() throws IOException {
		super();
	}
	
	@Override 
	public void getStudentInfoByType(String name,int age,Score score) throws IOException {
		System.out.println("Enter nrc number: ");
		String nrcNumber = inputReader.readLine();
		this.student = new RegularStudent(name,age,score,nrcNumber);
	}
}
