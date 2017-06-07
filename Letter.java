package com.wonderfulbytes.tests.stacksAndQueues.familymail;

public class Letter {
	private String sender;
	private Resident recipient;
	private Address address;
	
	// for the sake of simplicity,we don't have 
	// a sender in one of the constructors	
	public Letter(Resident recipient) {
		this.recipient = recipient;
		address = 
			recipient.getResidence().getAddress();
		}
	
	public Letter(String sender, Resident recipient) {
		this.sender = sender;
		this.recipient = recipient;	
	}
	
	public Resident getRecipient() {
		return recipient;
	}
	

}
