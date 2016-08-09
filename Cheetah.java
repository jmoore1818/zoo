package com.Zoo;

public class Cheetah extends Animal {
	private int topSpeed = 0;
	private String favPlace = null;
	
	public Cheetah(String species, String gender, int age, int topSpeed, String favPlace) {
		super(species, gender, age);
		this.topSpeed = topSpeed;
		this.favPlace = favPlace;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public String getFavPlace() {
		return favPlace;
	}

	public void setFavPlace(String favPlace) {
		this.favPlace = favPlace;
	}

	@Override
	public String toString() {
		return "Cheetah [topSpeed=" + topSpeed + ", favPlace=" + favPlace + ", species=" + species + ", gender="
				+ gender + ", age=" + age + "]";
	}
	
	
	
}
