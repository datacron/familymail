package com.wonderfulbytes.tests.stacksAndQueues.familymail;

import java.util.ArrayList;

public class MailService {
	ArrayList<PostMan> postMen;
	ArrayList<Letter> letters;
	ArrayList<MailBox> mailBoxes;

	public MailService() {
		postMen = new ArrayList<>();
		letters = new ArrayList<>();
		mailBoxes = new ArrayList<>();
		System.out.println(">Mail Service Created");
	}
	
	public void collect(ArrayList<Letter> letters) {
		this.letters.addAll(letters);
	}
	
	public void registerResidence(Residence residence) {
		mailBoxes.add(residence.getMailBox());
	}
	
	public void registerPostMan(PostMan postMan) {
		postMen.add(postMan);
	}
	
	public void assignResidenceToPostMan(Residence residence, PostMan postman) {
		postman.addMailBox(residence.getMailBox());
	}
	
	public int getMailSize() {
		return letters.size();
	}
	
	public void distributeLetters() {
		ArrayList<Letter> lettersToRemove = 
				new ArrayList<>();
		for (PostMan postMan : postMen) {
			for (MailBox mailBox : postMan.getMailBoxes()) {
				for (Letter letter : letters) {
					if (letter.getRecipient().
							getResidence().
							getMailBox() == mailBox) {
						postMan.collectLetter(letter);
						lettersToRemove.add(letter);
					}
				}
				for (Letter letterToRemove : lettersToRemove) {
					letters.remove(letterToRemove);
				}
			}
		}
		System.out.println("Letters distributed to postmen.");
	}
	
	public PostMan getPostMan(int index) {
		return postMen.get(index);
	}

	public void deliver() {
		for (PostMan postMan : postMen) {
			postMan.deliverMail();
		}
		System.out.println(">Mail has been delivered");
	}


}
