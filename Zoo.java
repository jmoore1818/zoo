package com.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to know what animals I saw today? (y/n)");
		String userInput = sc.nextLine();
		//boolean y = true;
		
		if(userInput.equalsIgnoreCase("y")){
		
		ArrayList<Animal> ourZoo = new ArrayList<>(10);
		
		Monkey monkeyA = new Monkey("Monkey", "female", 4, 15, "happy");
		Monkey monkeyB = new Monkey("Monkey", "male", 4, 13, "angry");
		Monkey monkeyC = new Monkey("Monkey", "female", 20, 150, "greedy");
		Alligator alligatorA = new Alligator("Alligator", "male", 10, 142, 3);
		Alligator alligatorB = new Alligator("Alligator", "female", 25, 216, 2);
		Lion lionA = new Lion("Lion", "male", 10, "Calves", 2);
		Lion lionB = new Lion("Lion", "male", 12, "Antelopes", 8);
		Cheetah cheetahA = new Cheetah("Cheetah", "female", 12, 45, "pride rock");
		Cheetah cheetahB = new Cheetah("Cheetah", "male", 4, 40, "by the water");
		Cheetah cheetahC = new Cheetah("Cheetah", "female", 4, 45, "in the den");
		
		ourZoo.add(cheetahA);
		ourZoo.add(lionB);
		ourZoo.add(monkeyC);
		ourZoo.add(alligatorA);
		ourZoo.add(monkeyA);
		ourZoo.add(cheetahB);
		ourZoo.add(monkeyB);
		ourZoo.add(alligatorB);
		ourZoo.add(lionA);
		ourZoo.add(cheetahC);		

		
		for(int i=0; i< ourZoo.size(); i++)
	
		System.out.println("Today at the zoo I saw a " + (ourZoo).get(i));
		
		
		}
		else System.out.println("Okay then!  Have a nice day.");
	}

	
}
