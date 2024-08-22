package com.example.dao;

import com.example.model.Student;

public class StudentDaoImp implements StudentDao{
	private static Student[] studentsList = new Student[Student.getMaxStudentCount()];

	@Override
	public void addStudent(Student student) {
		studentsList[Student.getTotalStudentCount() -1] = student;
	}

	@Override
	public Student getStudentById(int id) {
		return null;
	}
	
	@Override
	public Student getStudentByName(String name) {
		for(int i = 0; i < Student.getTotalStudentCount(); i++) {
			if(studentsList[i].getStudentName().equalsIgnoreCase(name)) {
				return studentsList[i];
			}
		}
		return null;
	}

	@Override
	public Student[] getAllStudents() {
		return studentsList;
	}

	@Override
	public void updateStudent(Student student) {
		
	}

	@Override
	public void deleteStudent(int id) {
		
	}

}
