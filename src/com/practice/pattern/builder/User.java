package com.practice.pattern.builder;

public class User {
	private String fisrtName; // required
	private String lastName;  // required
	private int age;          // optional
	private String phone;     // optional
	private String address;   // optional
	
	public User(UserBuilder builder){
		this.fisrtName = builder.fisrtName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;			
	}
		
	public String getFisrtName() {
		return fisrtName;
	}


	public String getLastName() {
		return lastName;
	}


	public int getAge() {
		return age;
	}


	public String getPhone() {
		return phone;
	}


	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "User [fisrtName=" + fisrtName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	public static class UserBuilder{
		private String fisrtName;
		private String lastName;
		private int age;
		private String phone;
		private String address;
		
		public UserBuilder(String firstName, String lastName){
			this.fisrtName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder age(int age){
			this.age = age;
			return this;
		}
		
		public UserBuilder phone(String phone){
			this.phone = phone;
			return this;
		}
		
		public UserBuilder address(String address){
			this.address = address;
			return this;
		}			
		
		public User build(){
			User user = new User(this);
			validateUser(user);
			return user;
		}
		
		private User validateUser(User user){
			// if any validation required
			return user;
		}
	}
}
