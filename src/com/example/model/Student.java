package com.example.model;

public class Student {
	//specialization
	private String id;
	private String name;
	private int age;
	private Score score;
	private int averageMarks;
	private static int maxStudentCount = 1000;
	private static Student[] studentsList = new Student[maxStudentCount];
	private static int totalStudentCount;
	
	public Student(String name, int age, Score score) {
		this.name = name;
		this.age = age;
		this.score = score;
		totalStudentCount++;
		this.id = "STU" + totalStudentCount;
	}
	
	public void addStudent(Student student) {
		studentsList[totalStudentCount -1] = student;
	}
	
	public int getToalStudentCount() {
		return totalStudentCount;
	}
	
	@Override
	public String toString() {
		return "id: " + this.id + "\n name: " + this.name + "\n age: " + this.age + "\n Exam result" + "\n" + "Myanmar - " + this.score.getMyanmar() + "\n English - " + this.score.getEnglish() + "\n Maths - " + this.score.getMaths() + "\n Chemistry - "+ this.score.getChemistry() + "\n Physics - "+ this.score.getPhysics() + "\n Biology - " + this.score.getBiology();
	}
}
