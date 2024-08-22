package com.example.model;

public class InternationalStudent extends Student {
	
	private VisaInformation visaInformation;
	private static int internationalStudentCount;
	
	public InternationalStudent(String name, int age, VisaInformation visaInformation) {
		super(name, age);
		this.visaInformation = visaInformation;
		internationalStudentCount++;
	}
	
	public static int getInternationalStudentCount() {
		return internationalStudentCount;
	}
}
