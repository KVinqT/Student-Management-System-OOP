package com.example.model;

public class Student {
	//specialization
	private String id;
	private String name;
	private int age;
	private int averageMarks;
	private static final int maxStudentCount = 1000;
	private static int totalStudentCount;
	private Exam exam;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		totalStudentCount++;
		this.id = "STU" + totalStudentCount;
	}
	public static int getMaxStudentCount() {
		return maxStudentCount;
	}
	public static int getTotalStudentCount() {
		return totalStudentCount;
	}
	public String getStudentName() {
		return name;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public Exam getExam() {
		return exam;
	}
	public String getStudentId() {
		return id;
	}
	@Override
	public String toString() {
		return "id: " + this.id + "\n name: " + this.name + "\n age: " + this.age;
	}
}
