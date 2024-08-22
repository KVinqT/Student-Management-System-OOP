package com.example.model;

public class RegularStudent extends Student {
	private String nrcNumber; 
	private static int regularStudentCount; 
	
	public RegularStudent(String name, int age, String nrcNumber) {
		super(name,age);
		this.nrcNumber = nrcNumber;
		regularStudentCount++;
	}
	
	public static int getRegularStudentCount() {
		return regularStudentCount;
	}

}
