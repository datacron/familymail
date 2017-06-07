/**
 * Names from fantasynamegenerators.com
 */
package com.wonderfulbytes.tests.stacksAndQueues.familymail;

import java.util.Random;

public class NameGenerator {
	
	private Gender gender;
	
	private String[] maleNames = {
			"Billie", "Alexis", "Terry",
			"Vic", "Mason", "Carter",
			"Bennie", "Phoenix", "Gail",
			"Kris", "Kai", "Archie",
			"Anthony", "John", "Reuben",
			"Josh", "Marquis", "Kellan",
			"Brenden", "Elijah", "Derick",
			"Aidan", "Louie", "Ben",
			"Jacob", "Reuben", "Kolby",
			"Ezekiel", "Braylon", "Rylee",
			"Riley", "Eliott", "Matthew",
			"Patrick", "Joshua", "Josh",
			"Oscar", "Tyler", "Franco"
	};
	
	private String[] femaleNames = {
			"Zara", "Amber", "Matilda",
			"Lilly", "Jade", "Carlie",
			"Ximena", "Brynlee", "Vanessa",
			"Annabell", "Eliza", "Isobel",
			"Chelsea", "Georgia", "Molly",
			"Raven", "Mia", "Mina",
			"Amaya", "Kaya", "Maria",
			"Louise", "Paige", "Millie",
			"Journee", "Alivia", "Brianna",
			"Joy", "Elsie", "Sophia",
			"Maya", "Naomi", "Dorothy",
			"Yasmin", "Jessica", "Aileen",
			"Sonia", "Alisson", "Melissa"
	};
	

	public NameGenerator() {
		Random genderRandom = new Random();
		boolean male = genderRandom.nextBoolean();
		this.gender = male == true ? gender.MALE : gender.FEMALE;
	}
	
	public NameGenerator(Gender gender) {
		this.gender = gender;
	}
	
	public String generateName() {
		
		String theName = new String();
		switch (gender) {
			case MALE:
				theName = maleNames[(int) (Math.random()*maleNames.length)];
				break;
			case FEMALE:
				theName = femaleNames[(int) (Math.random()*femaleNames.length)];
				break;
		}
		return theName;
		
	}
	
	public Gender getGender() {
		return gender;
	}
	
	
	

}
