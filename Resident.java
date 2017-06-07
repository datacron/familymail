package com.wonderfulbytes.tests.stacksAndQueues.familymail;

public class Resident extends Person implements MailChecker {

	Residence residence;
	
	public Resident(Residence residence) {
		this.residence = residence;
	}
	
	public Residence getResidence() {
		return residence;
	}

	@Override
	public boolean checkMail(MailBox mailBox) {
		System.out.println(">" + this.getName() + " checks mailBox...");
		Stack<Letter> mail = mailBox.getMail();
		Stack<Letter> othersMail = new Stack<>(mailBox.getMail().getSize());
		boolean hasMail = false;
		while (!mail.isEmpty()) {
			if (mail.peek().getRecipient() != this) {
				othersMail.push(mail.pop());
			} else {
				mail.pop();
				hasMail = true;
			}
		}
		while (!othersMail.isEmpty()) {
			mail.push(othersMail.pop());
		}
		if (hasMail) {
			System.out.println("\tcollects mail");
			return true;
		} else {
			System.out.println("\tno mail for " +
					this.getName());
			return false;
		}
		
		
	}

}
