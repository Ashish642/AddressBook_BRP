package com.blz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem  implements Info {
    // ArrayList Declarer
    ArrayList<Person> book = new ArrayList<>();
    // Creating scanner class object
    Scanner sc = new Scanner(System.in);
    public void add(){
        // user input to print the details
        System.out.println("Enter the Firstname: ");
        String firstName = sc.nextLine();
        System.out.println("Enter the Lastname: ");
        String lastname = sc.nextLine();
        System.out.println("Enter the Address: ");
        String address = sc.nextLine();
        System.out.println("Enter the City: ");
        String city = sc.nextLine();
        System.out.println("Enter the State: ");
        String state = sc.nextLine();
        System.out.println("Enter the Zip code : ");
        String zip = sc.nextLine();
        System.out.println("Enter the Phone Number: ");
        long phoneNumber = sc.nextLong();

        Person person = new Person(firstName, lastname, address, city, state, zip, phoneNumber);
        book.add(person);
        System.out.println("Successfully Add.....");
    }
    // Display the person details added
    public void display(){
        for (Person person: book){
            System.out.println(person);
        }

    }
}
