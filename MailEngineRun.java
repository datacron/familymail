package com.wonderfulbytes.tests.stacksAndQueues.familymail;

import java.util.ArrayList;

public class MailEngineRun {

	
	public MailEngineRun() {
		
	}

	public static void main(String[] args) {
		
		// Create 3 residences with N residents
		Residence[] residenceArray = 
			{new Residence(4), new Residence(3), new Residence(2)};
		for (Residence r : residenceArray) {
			System.out.println("Residence " + r.hashCode() + " has " 
					+ r.getNResidents() + " residents");
			r.displayResidents();
		}
		System.out.println("\n>Residences Created\n");
		
		// Create Mail Service and register residences
		MailService mailService = new MailService();
		for (Residence r : residenceArray) {
			mailService.registerResidence(r);
		}
		System.out.println(">Residences registered to Mail Service");
		
		// Create & register 2 postmen, assign the first one 2 mailBoxes 
		// and just one to the second postman.
		PostMan p1 = new PostMan();
		PostMan p2 = new PostMan();
		mailService.registerPostMan(p1);
		mailService.registerPostMan(p2);
		mailService.assignResidenceToPostMan(residenceArray[0], p1);
		mailService.assignResidenceToPostMan(residenceArray[1], p1);
		mailService.assignResidenceToPostMan(residenceArray[2], p2);
		System.out.println(">Postmen registered to Mail Service");
		System.out.println(">Residences' mailboxes registered to postmen\n");
		
		System.out.println("Postmen Status\n");
		System.out.println("PostMan #1:");
		System.out.println(p1);
		System.out.println("PostMan #2:");
		System.out.println(p2);
		System.out.println();
		
		// Create Letters for some random residents,
		// then mailService collects them for processing
		// and delivering.
		ArrayList<Letter> letters = new ArrayList<>();
		letters.add(new Letter(residenceArray[0].getResident(0)));
		letters.add(new Letter(residenceArray[0].getResident(1)));
		letters.add(new Letter(residenceArray[0].getResident(0)));
		letters.add(new Letter(residenceArray[0].getResident(3)));
		letters.add(new Letter(residenceArray[1].getResident(2)));
		letters.add(new Letter(residenceArray[2].getResident(0)));
		letters.add(new Letter(residenceArray[2].getResident(0)));
		letters.add(new Letter(residenceArray[2].getResident(1)));
		
		// MailService gets the letters
		// and distributes them to the postmen
		mailService.collect(letters);
		mailService.distributeLetters();
		System.out.println();
		
		System.out.println("Postmen status\n");
		System.out.println("PostMan #1");
		System.out.println(p1);
		p1.displayMail();
		
		System.out.println("PostMan #2");
		System.out.println(p2);
		p2.displayMail();
		System.out.println();
		
		System.out.println(">Mail still not delivered;");
		System.out.println(">Verifying empty mailboxes...");
		for (Residence r : residenceArray) {
			System.out.print("\tResidence " + r.hashCode() + " mail box empty ? - ");
			System.out.println(r.getMailBox().isEmpty());
		}
		System.out.println();
		mailService.deliver();
		System.out.println();
		System.out.println(">Verifying that postmen have no pending letters\n");
		System.out.println("PostMan #1");
		System.out.println(p1);
		System.out.println("PostMan #2");
		System.out.println(p2);
		System.out.println();
		
		System.out.println(">Verifying mailboxes are now not empty...");
		for (Residence r : residenceArray) {
			System.out.print("\tResidence " + r.hashCode() + " mail box empty ? - ");
			System.out.println(r.getMailBox().isEmpty());
		}
		System.out.println();
		
		System.out.println("Residence " + residenceArray[0].hashCode());
		System.out.println(residenceArray[0].getMailBox());
		residenceArray[0].getResident(0).checkMail(residenceArray[0].getMailBox());
		System.out.println(residenceArray[0].getMailBox());
		residenceArray[0].getResident(1).checkMail(residenceArray[0].getMailBox());
		System.out.println(residenceArray[0].getMailBox());
		residenceArray[0].getResident(1).checkMail(residenceArray[0].getMailBox());
		System.out.println(residenceArray[0].getMailBox());
		residenceArray[0].getResident(2).checkMail(residenceArray[0].getMailBox());
		System.out.println(residenceArray[0].getMailBox());
		residenceArray[0].getResident(3).checkMail(residenceArray[0].getMailBox());
		System.out.println(residenceArray[0].getMailBox());
	}
	

}
