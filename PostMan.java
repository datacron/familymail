package com.wonderfulbytes.tests.stacksAndQueues.familymail;

import java.util.ArrayList;

public class PostMan extends Person {
	// Mail he receives from MailService
	ArrayList<Letter> mail = new ArrayList<>();
	// MailBoxes assigned to
	ArrayList<MailBox> mailBoxes = new ArrayList<>();
	/**
	 * 
	 */
	public PostMan() {
		super(Gender.MALE);
	}
	public void addMailBox(MailBox mailBox) {
		mailBoxes.add(mailBox);
	}
	public ArrayList<MailBox> getMailBoxes() {
		return mailBoxes;
	}
	
	public void collectMail(ArrayList<Letter> letters) {
		// Collects only the mail belonging
		// to the mailboxes he's assigned to
		for (Letter letter : letters) {
			for (MailBox mailBox : mailBoxes) {
				if (letter.getRecipient().getResidence().getMailBox() == mailBox) {
					mail.add(letter);
					letters.remove(letter);
				}
			}
		}
	}
	
	public void collectLetter(Letter letter) {
		mail.add(letter);
	}
	
	public void deliverMail() {
		// Go through all the letters
		// and put right letters in the mailBox
		ArrayList<Letter> lettersToRemove = 
				new ArrayList<>();
		for (MailBox mailBox : mailBoxes) {
			for (Letter letter : mail) {
				if (letter.getRecipient()
						.getResidence().getMailBox() 
						== mailBox) {
					mailBox.put(letter);
					lettersToRemove.add(letter);
				}
			}
			for (Letter letterToRemove : lettersToRemove) {
				mail.remove(letterToRemove);
			}
		}
		
	}
	
	public void displayMail() {	
		for (Letter letter : mail) {
			System.out.println("\t\tLetter for " 
			+ letter.getRecipient().getName() );
		}
	}
	
	public String toString() {
		return "\tHi, I'm " + this.getName() + ", a postman.\n"+ 
				"\tI've been assigned to " + 
				mailBoxes.size() + " mail box(es)" +
				"\n\tI have " + mail.size() + 
				" letter(s) pending.";
				
	}

}
