package com.bl.AddressBookSystem;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");

		PersonDetails personOne = new PersonDetails();
		personOne.setFirstName("Rahul");
		personOne.setLastName("Labade");
		personOne.setAddress("Arjun_Nagar");
		personOne.setCity("Amravati");
		personOne.setState("Maharashtra");
		personOne.setZip("456123");
		personOne.setPhoneNumber("123456789");
		personOne.setEmail("rahullabade05@gmail.com");
		System.out.println(personOne.toString());

		PersonDetails personTwo = new PersonDetails();
		personTwo.setFirstName("Nikhil");
		personTwo.setLastName("Labade");
		personTwo.setAddress("Arjun_Nagar");
		personTwo.setCity("Amravati");
		personTwo.setState("Maharashtra");
		personTwo.setZip("456123");
		personTwo.setPhoneNumber("123456789");
		personTwo.setEmail("Nikhillabade05@gmail.com");
		System.out.println(personTwo.toString());

	}

}
