package com.example.javachallenge;

public class Messages extends contactlist {
	private static String messageName;
	private static String latestMessageContents;

	public Messages(String messageName, String latestMessageContents) {

		Messages.messageName = messageName;
		Messages.latestMessageContents = latestMessageContents;
	}

	public void choiceAnswer(int choice) {

		switch (choice) {

		case 1:
			seeAllMessages();
			break;
		case 2:
			sendMessage(messageName, latestMessageContents);
			break;

		}

	}

	public void options() {

		System.out.println(
				"\n\t 1. See all messages " + "\n\t 2. Send a new message " + "\n\t 3. Go back to the previous menu ");

	}

	public void seeAllMessages() {

		for (String i : messageList.keySet()) {
			String j = messageList.get(i);
			System.out.println(i + ":  " + "\n" + j + "\n");
		}
	}

	public void sendMessage(String messageName, String latestMessageContents) {

		messageList.replace(messageName, latestMessageContents);
		System.out.println("Your message has been sent! " + messageName + " " + messageList.get(messageName));

	}

	

}
