package com.example.model;

import com.example.dao.*;

public abstract class Student {
	//specialization
	private int id;
	private String name;
	private int age;
	private Score score;
	private int averageMarks;
	public static final int maxStudentCount = 1000;
	private static int totalStudentCount;
	
	public Student(String name, int age, Score score) {
		this.name = name;
		this.age = age;
		this.score = score;
		totalStudentCount++;
		this.id = totalStudentCount;
	}

	public static int getStudentCount() {
		return totalStudentCount;
	}

	public int getId(){
		return this.id;
	}

	@Override
	public String toString() {
		return "id: " + this.id + "\n name: " + this.name + "\n age: " + this.age + "\n Exam result" + "\n" + "Myanmar - " + this.score.getMyanmar() + "\n English - " + this.score.getEnglish() + "\n Maths - " + this.score.getMaths() + "\n Chemistry - "+ this.score.getChemistry() + "\n Physics - "+ this.score.getPhysics() + "\n Biology - " + this.score.getBiology();
	}
}
