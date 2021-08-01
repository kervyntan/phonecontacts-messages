package com.example.javachallenge;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int choice1, choice2, choice3, choice4;

		Scanner input = new Scanner(System.in);

		Contacts contact = new Contacts("James", 90473599);

		contact.contactList.put("James", 90473599);
		contact.contactList.put("twitty", 93131211);

		Messages messages = new Messages("Alex", "Piss Off");

		messages.messageList.put("Alex", "Test Message 1");
		messages.messageList.put("Don", "Test Message 2");
		messages.messageList.put("Mike", "Test Message 3");
		messages.messageList.put("JiaLe", "Test Message 4");

		System.out.println("Good Morning/Afternoon/Evening, what would you like to do? ");

		System.out.println("\n\t 1. Manage Contacts " + "\n\t 2. Messages " + "\n\t 3. Quit ");

		int choice = input.nextInt();

		

			if (choice == 1) {

				contact.options();

				choice1 = input.nextInt();
				contact.choiceRespond(choice1);

				if (choice1 == 5) {
					System.out.println("\n\t 1. Manage Contacts " + "\n\t 2. Messages " + "\n\t 3. Quit ");
					choice2 = input.nextInt();

					if (choice2 == 1) {

						contact.options();

						choice1 = input.nextInt();
						contact.choiceRespond(choice1);

					} else if (choice2 == 2) {

						messages.options();

						choice3 = input.nextInt();
						messages.choiceAnswer(choice3);

					}
				}

			} else if (choice == 2) {

				messages.options();

				choice3 = input.nextInt();
				messages.choiceAnswer(choice3);

				if (choice3 == 3) {

					System.out.println("\n\t 1. Manage Contacts " + "\n\t 2. Messages " + "\n\t 3. Quit ");
					choice4 = input.nextInt();

					if (choice4 == 2) {

						messages.options();

						choice2 = input.nextInt();
						messages.choiceAnswer(choice2);

					} else if (choice4 == 1) {

						contact.options();

						choice1 = input.nextInt();
						contact.choiceRespond(choice1);
					}

				} else if (choice == 3) {

					System.out.println("See you again next time! ");

				}

			}

		}
	}

