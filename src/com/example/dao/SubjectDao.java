package com.example.dao;

import com.example.model.Subject;

public interface SubjectDao {
	public void addSubject(Subject subject);
	public Subject getSubjectById(int id,String examId);
	public Subject getSubjectByName(String name, String examId);
	public Subject[] getAllSubjects(String examId);
	public void updateSubject(Subject Subject);
	public void deleteSubject(int id);
}
