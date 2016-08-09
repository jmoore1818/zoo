package com.Zoo;

public class Animal {
	
	protected String species = null;
	protected String gender = null;
	protected int age = 0;

	public Animal(String species, String gender, int age) {
		this.species = species;
		this.gender = gender;
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
}