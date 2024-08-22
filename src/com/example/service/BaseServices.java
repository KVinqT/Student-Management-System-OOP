package com.example.service;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.example.dao.ExamDaoImp;
import com.example.dao.StudentDaoImp;
import com.example.dao.StudentSubjectDaoImp;
import com.example.dao.SubjectDaoImp;

public class BaseServices {
	 static BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
	 static StudentDaoImp studentDao = new StudentDaoImp();
	 static ExamDaoImp examDao = new ExamDaoImp();
	 static SubjectDaoImp subjectDao = new SubjectDaoImp();
	 static StudentSubjectDaoImp studentSubDao = new StudentSubjectDaoImp();
}
