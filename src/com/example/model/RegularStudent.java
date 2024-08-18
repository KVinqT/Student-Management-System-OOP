package com.example.model;

public class RegularStudent extends Student {
	private String nrcNumber; 
	private static int regularStudentCount; 
	
	public RegularStudent(String name, int age, Score score, String nrcNumber) {
		super(name,age,score);
		this.nrcNumber = nrcNumber;
		regularStudentCount++;
	}

}
