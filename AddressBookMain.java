package com.bl.AddressBookSystem;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");

		PersonDetails person = new PersonDetails();
		person.FirstName("Rahul");
		person.LastName("Labade");
		person.Address("Arjun_Nagar");
		person.City("Amravati");
		person.State("Maharashtra");
		person.Zip("456123");
		person.PhoneNumber("123456789");
		person.Email("rahullabade05@gmail.com");
		System.out.println(person.toString());
	}

}
