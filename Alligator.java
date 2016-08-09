package com.Zoo;

public class Alligator extends Animal{
	private int teeth = 0;
	private int lengthOfTail = 0;
	
	public Alligator(String species, String gender, int age, int teeth, int lengthOfTail) {
		super(species, gender, age);
		this.teeth = teeth;
		this.lengthOfTail = lengthOfTail;
	}

	public int getTeeth() {
		return teeth;
	}

	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}

	public int getLengthOfTail() {
		return lengthOfTail;
	}

	public void setLengthOfTail(int lengthOfTail) {
		this.lengthOfTail = lengthOfTail;
	}

	@Override
	public String toString() {
		return "Alligator [teeth=" + teeth + ", lengthOfTail=" + lengthOfTail + ", species=" + species + ", gender="
				+ gender + ", age=" + age + "]";
	}
	
	
}
