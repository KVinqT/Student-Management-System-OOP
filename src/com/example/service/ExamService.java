package com.example.service;

import java.io.IOException;

import com.example.model.Exam;
import com.example.model.Student;
import com.example.model.Subject;


public class ExamService extends BaseServices{
	private Exam exam;
	private static SubjectService subjectService;
	public void createExam() throws IOException {
		String flag;
		do {
			System.out.println("Enter exam title: ");
			String title = inputReader.readLine();
			exam = new Exam(title);
			String examId = exam.getExamId();
			String examName = exam.getExamName();
			createSubjectForExam(examId,examName);
			examDao.addExam(exam);
			System.out.println("Do you want to create more exam? yes/no: ");
			flag = inputReader.readLine();
		} while(flag.equalsIgnoreCase("yes"));
	}
	
	//can refactor and leave the function inside subjectService
	public void createSubjectForExam(String examId,String examName) throws IOException {
		subjectService = new SubjectService();
		subjectService.createSubject(examId,examName);
	}
	
	public Student registerStudentToExam() throws IOException {
		System.out.println("Enter student name: ");
		String studentName = inputReader.readLine();
		Student existStudent = studentDao.getStudentByName(studentName);
		if(existStudent == null) {
			System.out.println("Student not found !");
			registerStudentToExam();
		}
		Exam existExam;
		do {
			System.out.println("Enter exam name for student: ");
			String examName = inputReader.readLine();
			existExam = examDao.getExamByName(examName);
			if(existExam == null) {
				System.out.println("Exam not found !");
			}
		} while(existExam == null);
		existStudent.setExam(existExam);
		getAvailableSubjectsOfStudent(studentName,existExam);
		return existStudent;
	}
	
	public void getAvailableSubjectsOfStudent(String studentName,Exam exam) {
		System.out.println("Available subjects of the exam for " + studentName);
		subjectService.displaySubjects(exam.getExamId(),exam.getExamName());
	}
	
	public Exam getExamByName(String examName) {
		return examDao.getExamByName(examName);
	}
	public void displayExam() {
		System.out.println("----- Exam Lists -----");
		Exam[] allExams = examDao.getAllExams();
		for(int i = 0; i < exam.getExamCount(); i++) {
			System.out.println(i+1 + "." + allExams[i].getExamName());
		}

	}
}
