package com.shariful.mar4.chatapp;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ChatApp {

	public static void main(String[] args) {

		ArrayList<User> users = new ArrayList<User>();
		ArrayList<Chatroom> chatrooms = new ArrayList<Chatroom>();
		Scanner in = new Scanner(System.in);
		boolean skipmenu = false;
		System.out.println("**Welcome to chat application**\n");
		while (true) {
			if (!skipmenu) {
				print("1) Create Chatroom");
				print("2) Add user");
				print("3) User login");
				print("4) List users of chatroom");
				print("5) Delete user");
				print("6) Delete chatroom");
				print("7) Close application");
				print("8) List all users");
				print("9) List all chatrooms\n");
			} else {
				skipmenu = false;
			}
			sprint("Enter your Choice :");
			int choice = Integer.parseInt(in.next());
			boolean close = false;
			switch (choice) {
			case 1:
				createChatroom(chatrooms, in);
				break;
			case 2:
				if (chatrooms.size() == 0) {
					print("Create atleast one chatroom before creating users");
					skipmenu = true;
				} else {
					addUser(users, in);
				}
				break;
			case 3:

				userLogin(users, chatrooms, in);
				break;
			case 4:
				if (chatrooms.size() == 0) {
					print("Create atleast one chatroom before using this function");
					skipmenu = true;
				} else {
					listAllUsersofChatroom(users, chatrooms, in);
				}

				break;
				
			case 5:
				
				print("Enter username:");
				users.remove(new User(in.next(),""));
				print("user deleted");
				
				break;
			case 6:
				print("Enter chatroom name:");
				chatrooms.remove(new Chatroom(in.next()));
				print("chatroom deleted");
				
				break;

			case 7:
				close = true;
				break;
			case 8:
				for (User user : users) {
					System.out.println(user);
				}

				break;
			case 9:
				for (Chatroom room : chatrooms) {
					System.out.println(room);
				}
				break;
			}

			if (close) {
				break;
			}
		}
	}

	static void listAllUsersofChatroom(ArrayList<User> users,
			ArrayList<Chatroom> chatrooms, Scanner in) {

		print("Please select chatroom");
		for (int i = 0; i < chatrooms.size(); i++) {
			print((i + 1) + ")" + chatrooms.get(i).getName());
		}
		sprint("\n Your choice : ");
		int choice = Integer.parseInt(in.next());

		for (User user : users) {
			if (user.getUserChatroom() == chatrooms.get(choice - 1)) {
				System.out.println(user);
			}
		}
	}

	static void userLogin(ArrayList<User> users, ArrayList<Chatroom> chatrooms,
			Scanner in) {
		User session = null;
		while (true) {
			print("");
			sprint("Username : ");
			String username = in.next();
			sprint("Password : ");
			String password = in.next();
			boolean login = false;
			for (User user : users) {
				if (user.getName().equals(username)
						&& user.getPassword().equals(password)) {
					login = true;
					session = user;
					break;
				}

			}
			if (!login) {
				print("Wrong username/password. do you want to continue?  0-Yes 1-No");
				if (Integer.parseInt(in.next()) == 1) {
					break;
				}
			} else {
				userMenu(session, chatrooms, in);
				break;
			}
		}
	}

	static void userMenu(User session, ArrayList<Chatroom> chatrooms, Scanner in) {
		if (session.getUserChatroom() == null) {
			print("You dont belong to any chat room. Please select one");
			for (int i = 0; i < chatrooms.size(); i++) {
				print((i + 1) + ")" + chatrooms.get(i).getName());
			}
			sprint("\n Your choice : ");
			int choice = Integer.parseInt(in.next());

			session.setUserChatroom(chatrooms.get(choice - 1));
		}
		TreeMap<Long, Message> messageMap = session.getUserChatroom()
				.getMessageMap();
		Chatroom userChatroom = session.getUserChatroom();
		Set<Long> messagemapkeys = userChatroom.getMessageMap().keySet();

		for (Long key : messagemapkeys) {
			System.out.println((messageMap.get(key)));
		}

		while (true) {
			sprint("\n Your Message (q- to quit):");
			String msg = in.next();
			if (msg.equals("q")) {
				break;
			} else {
				Message t = userChatroom.pushMessage(session, msg);
				System.out.println(t);
			}
		}

	}

	static void createChatroom(ArrayList<Chatroom> chatrooms, Scanner in) {

		while (true) {
			sprint("Enter Chatroom Name:");
			String name = in.next();

			Chatroom newChatroom = new Chatroom(name);
			if (!chatrooms.contains(newChatroom)) {
				chatrooms.add(newChatroom);
				print("Chatroom added!");
			} else {
				print("Chatroom already exists");
			}
			print("Do you want to add another chatroom? 0-Yes 1-No");
			if (Integer.parseInt(in.next()) == 1) {
				break;
			}
		}
	}

	static void addUser(ArrayList<User> users, Scanner in) {
		while (true) {

			sprint("Enter username:");
			String name = in.next();
			sprint("Enter password:");
			String password = in.next();
			User newUser = new User(name, password);
			if (!users.contains(newUser)) {
				users.add(newUser);
				print("User added!");
			} else {
				print("User already exists");
			}
			print("Do you want to add another user? 0-Yes 1-No");
			if (Integer.parseInt(in.next()) == 1) {
				break;
			}
		}
	}

	static void print(String a) {
		System.out.println(a);
	}

	static void sprint(String a) {
		System.out.print(a);
	}	
}
