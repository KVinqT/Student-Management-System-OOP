package com.example.model;

public class StudentSubject {
	private String studentId;
	private String studentName;
	private int subjectId;
	private String subjectName;
	private int marks;
	private static final int maxStudentSubjectCount = 1000;
	private static int totalStudentSubjectCount;
	
	
	public StudentSubject(int marks, int subjectId, String subjectName,String studentId,String studentName) {
		this.marks = marks;
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.studentId = studentId;
		this.studentName = studentName;
		totalStudentSubjectCount++;
	}
	
	public static int getMaxStudentSubjectCount() {
		return maxStudentSubjectCount;
	}
	
	public static int getTotalStudentSubjectCount() {
		return totalStudentSubjectCount;
	}
	public String getStudentId() {
		return studentId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public int getMarks() {
		return marks;
	}
}
