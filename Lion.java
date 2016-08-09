package com.Zoo;

public class Lion extends Animal {
	private String favoriteFood = null;
	private int numberOfChildren = 0;
	
	public Lion(String species, String gender, int age, String favoriteFood, int numberOfChildren) {
		super(species, gender, age);
		this.favoriteFood = favoriteFood;
		this.numberOfChildren = numberOfChildren;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	@Override
	public String toString() {
		return "Lion [favoriteFood=" + favoriteFood + ", numberOfChildren=" + numberOfChildren + ", species=" + species
				+ ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
