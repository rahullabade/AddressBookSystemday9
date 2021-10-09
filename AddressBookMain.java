package com.bl.AddressBookSystem;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");

		PersonDetails personOne = new PersonDetails();
		personOne.FirstName("Rahul");
		personOne.LastName("Labade");
		personOne.Address("Arjun_Nagar");
		personOne.City("Amravati");
		personOne.State("Maharashtra");
		personOne.Zip("456123");
		personOne.PhoneNumber("123456789");
		personOne.Email("rahullabade05@gmail.com");
		System.out.println(personOne.toString());
		
		PersonDetails personTwo = new PersonDetails();
		personTwo.FirstName("Nikhil");
		personTwo.LastName("Labade");
		personTwo.Address("Arjun_Nagar");
		personTwo.City("Amravati");
		personTwo.State("Maharashtra");
		personTwo.Zip("456123");
		personTwo.PhoneNumber("123456789");
		personTwo.Email("Nikhillabade05@gmail.com");
		System.out.println(personTwo.toString());
	}

}
