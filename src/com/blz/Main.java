package com.blz;

import java.util.Scanner;

public class Main {
    private void option() {
        boolean status = true;
        Scanner sc = new Scanner(System.in);
        // Create object
        AddressBookSystem addressBookSystem = new AddressBookSystem();
        /*
         * To print to perform Choice to print add and display method
         */
        while (status) {
            System.out.println("Enter your option : \n Press 1 to Add new person"+ "\n Press 2 to display details " +
                    "\n Press 9 to Quit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                        addressBookSystem.add();
                        break;
                case 2:
                         addressBookSystem.display();
                         break;
                default:
                          status = false;

            }
        }
    }
    /* Main method to call option */
    public static void main(String[] args) {
        Main main = new Main();
        main.option();
    }
}
