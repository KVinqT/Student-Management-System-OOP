package com.example.service;

import java.io.IOException;

import com.example.model.Subject;

public class SubjectService extends BaseServices{
	private Subject subj;
	public void createSubject(String examId,String examName) throws IOException {
		String flag;
		do { 
			System.out.println("Enter subject name: ");
			String name = inputReader.readLine();
			subj = new Subject(name,examId);
			subjectDao.addSubject(subj);
			System.out.println("Do you want to add more subject to " + examName + " exam? yes/no: ");
			flag = inputReader.readLine();
		}while(flag.equalsIgnoreCase("yes"));
		displaySubjects(examId,examName);
	}
	public void displaySubjects(String examId,String examName) {
		System.out.println("--- Subjects of " + examName + " exam ---");
		Subject[] subjects = subjectDao.getAllSubjects(examId);
		for(int i = 0; i < subjects.length; i++) {
			System.out.println(i+1 + "." + subjects[i].getSubjectName());
		}
	}
}
