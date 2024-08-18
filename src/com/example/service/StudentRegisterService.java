package com.example.service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.Score;
import com.example.model.Student;

public abstract class StudentRegisterService {
	BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
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
		System.out.println("Enter Myanmar subject marks");
		int myanmarSub = Integer.parseInt(inputReader.readLine());
		System.out.println("Enter English subject marks");
		int englishSub = Integer.parseInt(inputReader.readLine());
		System.out.println("Enter Maths subject marks");
		int mathsSub = Integer.parseInt(inputReader.readLine());
		System.out.println("Enter Chemistry subject marks");
		int chemistrySub = Integer.parseInt(inputReader.readLine());
		System.out.println("Enter Physics subject marks");
		int physicsSub = Integer.parseInt(inputReader.readLine());
		System.out.println("Enter Biology subject marks");
		int bioSub = Integer.parseInt(inputReader.readLine());
		Score score = new Score(myanmarSub,englishSub,mathsSub,chemistrySub,physicsSub,bioSub);
		this.getStudentInfoByType(name,age,score);
	}
	
	public abstract void getStudentInfoByType(String name, int age, Score score) throws IOException;
	
	public void displayStudent() {
		System.out.println("-------- Displaying student information --------");
		for(int i = 0; i < student.getToalStudentCount(); i++) {
			System.out.println(student);
		}
		System.out.println("Total student count: " + student.getToalStudentCount());
		System.out.println("Total regular student count: ");
		System.out.println("Total international student count");
	}
}
