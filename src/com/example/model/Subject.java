package com.example.model;

public class Subject {
	private int id;
	private String name;
	private static final int maxSubjectCount = 100;
	private static int totalSubjectCount;
	private String examId;
	
	public Subject(String name,String examId) {
		this.name = name;
		totalSubjectCount++;
		this.id = totalSubjectCount;
		this.examId = examId;
	}
	
	public static int getMaxSubjectCount() {
		return maxSubjectCount;
	}
	public static int getTotalSubjectCount() {
		return totalSubjectCount;
	}
	public String getExamIdOfSubject() {
		return examId;
	}
	public String getSubjectName() {
		return name;
	}
	public int getSubjectId() {
		return id;
	}
}
