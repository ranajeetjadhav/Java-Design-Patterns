package com.practice.pattern.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		User user1 = new User.UserBuilder("Ranajeet", "Jadhav").age(28).phone("8149659216").address("Ravet").build();
		
		System.out.println(user1.toString());
		
		User user2 = new User.UserBuilder("Dipika", "Jadhav").age(28).address("Ravet").build();
		
		System.out.println(user2.toString());

		User user3 = new User.UserBuilder("Avinash", "More").build();
		
		System.out.println(user3.toString());
	}

}
