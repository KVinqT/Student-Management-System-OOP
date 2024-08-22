package com.example.dao;

import java.util.Arrays;

import com.example.model.Exam;
import com.example.model.Subject;

public class SubjectDaoImp implements SubjectDao {
	private static Subject[] subjects = new Subject[Subject.getMaxSubjectCount()];
	@Override
	public void addSubject(Subject subject) {
		subjects[Subject.getTotalSubjectCount() - 1] = subject;
	}

	@Override
	public Subject getSubjectById(int id,String examId) {
		return null;
	}

	@Override
	public Subject getSubjectByName(String name, String examId) {
		for(int i = 0; i < Subject.getTotalSubjectCount(); i++) {
			if(subjects[i].getSubjectName().equalsIgnoreCase(name) && subjects[i].getExamIdOfSubject() == examId) {
				return subjects[i];
			}
		}
		return null;
	}

	@Override
	public Subject[] getAllSubjects(String examId) {
		Subject[] newSubjects = new Subject[0]; 
		for(int i = 0; i < Subject.getTotalSubjectCount(); i++) {
			if(subjects[i].getExamIdOfSubject() == examId) {
				newSubjects = Arrays.copyOf(newSubjects, newSubjects.length + 1);
				newSubjects[newSubjects.length - 1] = subjects[i];
			}
		}
		return newSubjects;
	}

	@Override
	public void updateSubject(Subject Subject) {
		
	}

	@Override
	public void deleteSubject(int id) {
		
	}
}
