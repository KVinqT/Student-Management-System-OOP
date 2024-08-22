package com.example.model;

public class Exam {
	private String id;
	private String title;
	private static final int maxExamCount = 10;
	private static int examCount;
	
	public Exam(String title) {
		this.title = title;
		examCount++;
		this.id = "EX- " + examCount;
	}
	public static int getMaxExamCount() {
		return maxExamCount;
	}
	public static int getExamCount() {
		return examCount;
	}
	public String getExamId() {
		return id;
	}
	public String getExamName() {
		return title;
	}
}
