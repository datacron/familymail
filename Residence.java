package com.wonderfulbytes.tests.stacksAndQueues.familymail;

import java.util.ArrayList;

public class Residence {
	private ArrayList<Resident> residents;
	private Address address;
	private MailBox mailBox;

	public Residence(int size) {
		// Populate residence; don't allow duplicate resident names
		// Just for fun, created an algorithm from scratch
		residents = new ArrayList<>();
		Resident rToAdd = new Resident(this);
		boolean gateClosed = false;
		for (int i = 0; i < size; i++) {	
			while (gateClosed) {
				rToAdd = new Resident(this);
				for (Resident rToCheck : residents) {
					gateClosed = rToCheck.getName()
							.equals(rToAdd.getName()) 
							? true : false;
					if (!gateClosed) {
						continue;
					} else {
						break;
					}
				}
			}
			residents.add(rToAdd);
			gateClosed = true;
		}
		
		
		// The address of the residence
		address = new Address();
		// Assign a mailbox to the residence
		mailBox = new MailBox();	
		
	}
	
	public void addResident(Resident resident) {
		residents.add(resident);
	}
	
	public int getNResidents() {
		return residents.size();
	}
	
	public Resident getResident(int index) {
		return residents.get(index);
	}
	
	public ArrayList<Resident> getResidents() {
		return residents;
	}
	
	public void displayResidents() {
		for (Resident resident : residents) {
			System.out.println("\t" +
				resident.getName());
		}
	}
	
	public Address getAddress() {
		return address;
	}
	
	public MailBox getMailBox() {
		return mailBox;
	}
	

}
