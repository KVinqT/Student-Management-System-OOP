package com.example.service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.dao.StudentDao;
import com.example.dao.StudentDaoImpl;
import com.example.model.InternationalStudent;
import com.example.model.RegularStudent;
import com.example.model.Score;
import com.example.model.Student;

public abstract class StudentRegisterService {
	BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
	protected Student student;
	private StudentDao studentDao;
	public StudentRegisterService() throws IOException {
		this.studentDao = new StudentDaoImpl();
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
		this.studentDao.create(this.student);
	}
	
	public abstract void getStudentInfoByType(String name, int age, Score score) throws IOException;
	
	public void displayStudent() {
		System.out.println("-------- Displaying student information --------");
		for(int i = 0; i < student.getStudentCount(); i++) {
			System.out.println(StudentDaoImpl.getStudentsList()[i]);
		}

		System.out.println("Total student count: " + student.getStudentCount());
		System.out.println("Total regular student count: " + RegularStudent.getRegularStudentCount());
		System.out.println("Total international student count " + InternationalStudent.getInterStudentCount());
	}
}
