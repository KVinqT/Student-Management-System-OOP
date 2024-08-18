package com.example.model;

public class Score {
	private int Myanmar;
	private int English;
	private int Maths;
	private int Chemistry;
	private int Physics;
	private int Biology;
	
	public Score(int Myanmar,int English,int Maths,int Chemistry,int Physics,int Biology) {
		this.Myanmar = Myanmar;
		this.English = English;
		this.Maths = Maths;
		this.Chemistry = Chemistry;
		this.Physics = Physics;
		this.Biology = Biology;
	}

	public int getMyanmar() {
		return Myanmar;
	}

	public int getEnglish() {
		return English;
	}

	
	public int getMaths() {
		return Maths;
	}

	
	public int getChemistry() {
		return Chemistry;
	}

	
	public int getPhysics() {
		return Physics;
	}

	
	public int getBiology() {
		return Biology;
	}

}
