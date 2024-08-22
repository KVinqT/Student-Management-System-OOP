package com.example.dao;

import com.example.model.StudentSubject;

public interface StudentSubjectDao {
	public void addStudentSubject(StudentSubject studentSubject);
	public StudentSubject[] getStudentSubjectLists();
}
