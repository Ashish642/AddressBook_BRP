package com.blz;

public class Person {
    // Variables
    private  String firstName;
    private  String lastName;
    private  String address;
    private  String city;
    private  String state;
    private  String zip;
    private  long phoneNumber;

    public Person(String firstName, String lastName, String address, String city, String state, String zip,
                  long phoneNumber) {       // Contructor
        this.firstName = firstName;
        this.lastName = lastName;
        this. address = address;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.zip = zip;

    }
   /* Getters and setter method return and set or update the value */

    public String getFirstName() {
        return firstName;
    }
    public void  setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

