package com.example.service;
import java.io.IOException;

import com.example.model.InternationalStudent;
import com.example.model.RegularStudent;
import com.example.model.Student;

public abstract class StudentRegisterService extends BaseServices {
	protected Student student;
	public StudentRegisterService() throws IOException {
		this.getStudentInfo();
	}
	//get student info
	public void getStudentInfo() throws IOException {
		System.out.println("Enter student name: ");
		String name = inputReader.readLine();
		System.out.println("Enter student age: ");
		int age = Integer.parseInt(inputReader.readLine());
		this.getStudentInfoByType(name,age);
	}
	
	public abstract void getStudentInfoByType(String name, int age) throws IOException;
	
	public void displayStudent() {
		System.out.println("-------- Displaying student information --------");
		for(int i = 0; i < Student.getTotalStudentCount(); i++) {
			System.out.println(studentDao.getAllStudents()[i]);
		}
		System.out.println("Total student count: " + Student.getTotalStudentCount());
		System.out.println("Total regular student count: " + RegularStudent.getRegularStudentCount());
		System.out.println("Total international student count" + InternationalStudent.getInternationalStudentCount());
	}
}
