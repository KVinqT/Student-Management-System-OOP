package com.example.model;

public class InternationalStudent extends Student {
	
	private VisaInformation visaInformation;
	private int internationalStudentCount;
	
	public InternationalStudent(String name, int age, Score score, VisaInformation visaInformation) {
		super(name, age, score);
		this.visaInformation = visaInformation;
		internationalStudentCount++;
	}
}
