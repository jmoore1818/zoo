package com.Zoo;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		
		ArrayList<Animal> ourZoo = new ArrayList<>(10);
		
		Monkey monkeyA = new Monkey("Monkey", "female", 4, 15, "happy");
		Monkey monkeyB = new Monkey("Monkey", "male", 4, 13, "angry");
		Monkey monkeyC = new Monkey("Monkey", "female", 20, 150, "greedy");
		Alligator alligatorA = new Alligator("Alligator", "male", 10, 142, 3);
		Alligator alligatorB = new Alligator("Alligator", "female", 25, 216, 2);
		Lion lionA = new Lion("Lion", "male", 10, "Calves", 2);
		Lion lionB = new Lion("Lion", "male", 12, "Antelopes", 8);
		Cheetah cheetahA = new Cheetah("Cheetah", "female", 12, 45, "Pride Rock");
		Cheetah cheetahB = new Cheetah("Cheetah", "male", 4, 40, "By the water");
		Cheetah cheetahC = new Cheetah("Cheetah", "female", 4, 45, "In the den");
		
		ourZoo.add(monkeyA);
		ourZoo.add(monkeyB);
		ourZoo.add(monkeyC);
		ourZoo.add(alligatorA);
		ourZoo.add(alligatorB);
		ourZoo.add(lionA);
		ourZoo.add(lionB);
		ourZoo.add(cheetahA);
		ourZoo.add(cheetahB);
		ourZoo.add(cheetahC);		

	
		System.out.println("Today at the zoo I saw a " + ourZoo.get(5));
	}

	
}
