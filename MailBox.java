package com.wonderfulbytes.tests.stacksAndQueues.familymail;

import java.util.ArrayList;

public class MailBox {
	private Stack<Letter> mail;
	
	public MailBox() {
		mail = new Stack<Letter>(20);
	}
	
	public Stack<Letter> getMail() {
		return mail;
	}
	
	public String toString() {
		return "This mailbox contains " + mail.getSize() + " letter(s)";
	}
	
	public void put(Letter letter) {
		mail.push(letter);
	}
	
	public boolean isEmpty() {
		if (mail.getSize()==0) {
			return true;
		} else {
			return false;
		}
			
	}
	

}
