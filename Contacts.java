package com.example.javachallenge;

public class Contacts extends contactlist {
	private static String contactName;
	private static int contactNumber;
	// contactName & contactNumber stores the values of the contact to be
	// added/deleted

	public Contacts(String contactName, int contactNumber) {
		Contacts.contactName = contactName;
		Contacts.contactNumber = contactNumber;
	}

	public void choiceRespond(int choice) {

		switch (choice) {
		case 1:
			show();
			break;
		case 2:
			add(contactName, contactNumber);
			break;
		case 3:
			search(contactName);
			break;
		case 4:
			delete(contactName);
			break;
		}

	}

	public void options() {

		System.out.println(
				"\n\t 1. Show all contacts " + "\n\t 2. Add a new contact " + "\n\t 3. Search for a new contact "
						+ "\n\t 4. Delete a contact " + "\n\t 5. Go back to the previous menu ");
	}

	public void show() {

		System.out.println("\nYour Contacts: ");

		for (String i : contactList.keySet()) {
			int correspondingNumber = contactList.get(i);
			System.out.println(i + " " + correspondingNumber);
			// loops through to show the whole list of contacts
		}

	}

	public void add(String contactName, int contactNumber) {

		System.out.println("Before adding:  ");

		show();

		contactList.put(contactName, contactNumber);

		System.out.println("\nAfter adding: ");

		// add for-each loop to check that contact has now been added to the total list
		for (String i : contactList.keySet()) {
			int correspondingNumber = contactList.get(i);
			System.out.println(i + " " + correspondingNumber);
		}
	}

	public void search(String contactName) {

		System.out.println("The number of " + contactName + " is : " + contactList.get(contactName));

		// searches using the .get method by passing the key of the value in the contact
	}

	public void delete(String contactName) {
		System.out.println("Before deleting : ");

		show();

		System.out.println("\n");
		contactList.remove(contactName);

		System.out.println("After deleting : ");

		show();
	}

	
}
