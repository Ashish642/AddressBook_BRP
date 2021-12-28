package com.blz;

public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to address book program");

        Person person = new Person("Ashish", "Kumar", "Allahabad, UP","Allahabad","UP","221404", 9453627297L);

        System.out.println("Firstname:"+ person.getFirstName());
        System.out.println("Lastname:"+ person.getLastName());
        System.out.println("Address:"+ person.getAddress());
        System.out.println("City:"+ person.getCity());
        System.out.println("State:"+person.getState());
        System.out.println("Phone Number:"+ person.getPhoneNumber());
        System.out.println("Zip:"+ person.getZip());
    }

}
