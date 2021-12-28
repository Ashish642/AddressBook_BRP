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

    /* Method to edit or Updata the details using firtName */
    public void edit(String firstName){
        for (int search = 0; search< book.size(); search++){
            if (book.get(search).getFirstName().equalsIgnoreCase(firstName)) {
                Person person = book.get(search);
                System.out.println("Hey "+ person.getFirstName() + "Please edit your details");
                System.out.println("Hey "+ person.getFirstName() + "Please edit your address");
                sc.next();
                String address = sc.nextLine();
                person.setAddress(address);
                System.out.println("Hey "+ person.getFirstName() + "Please edit your city");
                String city = sc.next();
                person.setCity(city);
                System.out.println("Hey "+ person.getFirstName() + "Please edit your state");
                String state = sc.next();
                person.setState(state);
                System.out.println("Hey "+ person.getFirstName() + "Please edit your Zip");
                String zip = sc.next();
                person.setZip(zip);
                System.out.println("Hey "+ person.getFirstName() + "Please edit your phone number");
                long phone = sc.nextLong();
                person.setPhoneNumber(phone);
            }
        }
    }

    /* Method to delete the details using firstname */
    public void delete(String firstName) {
        for (int select = 0; select< book.size(); select++){
            if (book.get(select).getFirstName().equalsIgnoreCase(firstName)) {
                Person person = book.get(select);
                book.remove(person);
                System.out.println("Successfully Deleted");
            }
        }
    }

    // Display the person details added
    public void display(){
        for (Person person: book){
            System.out.println(person);
        }

    }
}
