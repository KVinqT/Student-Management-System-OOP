package com.example.dao;

import com.example.model.StudentSubject;

public class StudentSubjectDaoImp implements StudentSubjectDao{
	static StudentSubject[] studentSubjectLists = new StudentSubject[StudentSubject.getMaxStudentSubjectCount()];

	@Override
	public void addStudentSubject(StudentSubject studentSubject) {
		studentSubjectLists[StudentSubject.getTotalStudentSubjectCount() - 1] = studentSubject;
	}

	@Override
	public StudentSubject[] getStudentSubjectLists() {
		return studentSubjectLists;
	}
}
