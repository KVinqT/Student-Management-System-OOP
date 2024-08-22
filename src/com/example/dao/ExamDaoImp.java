package com.example.dao;

import com.example.model.Exam;
import com.example.model.Student;

public class ExamDaoImp implements ExamDao {
	private static Exam[] examList = new Exam[Exam.getMaxExamCount()];
	
	public void addExam(Exam exam) {
		ExamDaoImp.examList[Exam.getExamCount() - 1] = exam;
	}

	@Override
	public Exam getExamById(int id) {
		return null;
	}

	@Override
	public Exam getExamByName(String name) {
		for(int i = 0; i < Exam.getExamCount(); i++) {
			if(examList[i].getExamName().equalsIgnoreCase(name)) {
				return examList[i];
			}
		}
		return null;
	}

	@Override
	public Exam[] getAllExams() {
		return examList;
	}

	@Override
	public void updateExam(Exam Exam) {
		
	}

	@Override
	public void deleteExam(int id) {
		
	}
}
