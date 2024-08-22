package com.example.service;

import java.io.IOException;
import java.util.Arrays;

import com.example.model.Exam;
import com.example.model.Student;
import com.example.model.StudentSubject;
import com.example.model.Subject;

public class StudentSubjectService extends BaseServices{
	private StudentSubject studentSubject;
	public void giveMarkOfSubjectToStudent(Student registeredStudent) throws IOException {
		System.out.println("Chose subject to give marks for student( " + registeredStudent.getStudentName() + " ):");
		String subjectNameInput = inputReader.readLine();
		Subject subject = subjectDao.getSubjectByName(subjectNameInput,registeredStudent.getExam().getExamId());
		if(subject == null) {
			System.out.println("Subject is not found!");
			giveMarkOfSubjectToStudent(registeredStudent);
		}
		System.out.println("Give marks of " + subject.getSubjectName() + " subject: ");
		int marks = Integer.parseInt(inputReader.readLine());
		int subjectId = subject.getSubjectId();
		String subjectName = subject.getSubjectName();
		String studentName = registeredStudent.getStudentName();
		String studentId = registeredStudent.getStudentId();
		
		//create object of student subject
		studentSubject = new StudentSubject(marks,subjectId,subjectName,studentId,studentName);
		studentSubDao.addStudentSubject(studentSubject);
		String flag;
		System.out.println("Do you want to give marks to another subject? yes/no: ");
		flag = inputReader.readLine();
		if(flag.equalsIgnoreCase("yes")) {
			giveMarkOfSubjectToStudent(registeredStudent);
		}

	}	
	public void displayTotalHighestMarkOfStudentByExam(String examName) {
		//get the students who have registered to the exam 
		Student[] studentsOfTheExam = new Student[0];
		Student[] studentLists = studentDao.getAllStudents();
		for(int i = 0; i < Student.getTotalStudentCount(); i++) {
			if(studentLists[i].getExam().getExamName().equalsIgnoreCase(examName)) {
				studentsOfTheExam = Arrays.copyOf(studentsOfTheExam, studentsOfTheExam.length + 1);
				studentsOfTheExam[studentsOfTheExam.length - 1] = studentLists[i];
			}
		}
		
		StudentSubject[] studentSubjectList = studentSubDao.getStudentSubjectLists();
		//loop through all student and get the highest marks and the student who gets it
		int totalMark = 0;
		StudentSubject highestStudentOfTheExam = null;
		int previousMark = 0;
		for(int i = 0; i < studentsOfTheExam.length; i++) {
			System.out.println("Hello 1");
			for(int j = 0; j < StudentSubject.getTotalStudentSubjectCount(); j++) {
				if(studentSubjectList[j].getStudentId() == studentsOfTheExam[i].getStudentId()) {
					System.out.println("Hello 2");
					totalMark = studentSubjectList[j].getMarks() + totalMark;
					if(previousMark > totalMark) {
						totalMark = previousMark;
					} else {
						previousMark = totalMark;
					}
					highestStudentOfTheExam = studentSubjectList[j];
				}
			}
		}
		System.out.println("The highest mark student name in the " + examName + "is " + highestStudentOfTheExam.getSubjectName()  + " with the total mark " + totalMark);
	}
	public void displaySubjectMarkOfStudent(Student registeredStudent) {
		 StudentSubject[] studentSubjectLists = studentSubDao.getStudentSubjectLists();
		 for(int i = 0; i < StudentSubject.getTotalStudentSubjectCount();i++) {
			if( studentSubjectLists[i].getStudentId().equalsIgnoreCase(registeredStudent.getStudentId())) {
				System.out.println("Mark of " + studentSubjectLists[i].getSubjectName() + " is = " + studentSubjectLists[i].getMarks());
			}
		 }
	}
}
