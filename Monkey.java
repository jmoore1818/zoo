package com.Zoo;

public class Monkey extends Animal{
	
	private int bananas = 0;
	private String personality = null;
	

	public Monkey(String species, String gender, int age, int bananas, String personality) {
		super(species, gender, age);
		this.bananas = bananas;
		this.personality = personality;


}


	public int getBananas() {
		return bananas;
	}


	public void setBananas(int bananas) {
		this.bananas = bananas;
	}


	public String getPersonality() {
		return personality;
	}


	public void setPersonality(String personality) {
		this.personality = personality;
	}


	@Override
	public String toString() {
		return "monkey that had " + bananas + " bananas. This monkey's tempermant was " + personality + ".  The " + species + "'s gender was "
			
				+ gender + " and age was " + age;
	}



	}







	

