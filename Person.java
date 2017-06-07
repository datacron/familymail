package com.wonderfulbytes.tests.stacksAndQueues.familymail;

import java.util.Observable;
import java.util.Random;

public class Person {
	private String name;
	private Gender gender;
	
	public Person() {
		NameGenerator pg = new NameGenerator();
		this.gender = pg.getGender();
		this.name = pg.generateName();
	}
	
	public Person(Gender gender) {
		this.gender = gender;
		NameGenerator pg = new NameGenerator(gender);
		this.name = pg.generateName();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void generateName() {
		
	}
	
	public void setGenre(Gender gender) {
		this.gender = gender;
	}
	

}
