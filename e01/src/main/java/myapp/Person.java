package myapp;

public class Person{
    private String name;
    private Address address;
    private PhoneNumber phoneNumber;



    Person (String n) {
        this.name = n;
    }

    Address setAddress(String street, String city, String zip) {
        return this.address = new Address(street, city, zip);
    }

    PhoneNumber setPhoneNumber(String countryCode, String number) {
        return this.phoneNumber = new PhoneNumber(countryCode, number);
    }

    void display() {
        System.out.println("Name: "+this.name);
        System.out.println("Address: " + this.address.street + ", " + this.address.city + ", " + this.address.zip);
        System.out.println("Phone: (" + this.phoneNumber.countryCode + ") " + this.phoneNumber.number);
    }

    private class Address {
        private String street;
        private String city;
        private String zip;

        Address (String s, String c, String z) {
            this.street = s;
            this.city = c;
            this.zip = z;
        }
    }

    private class PhoneNumber {
        private String countryCode;
        private String number;

        PhoneNumber (String cc, String n) {
            this.countryCode = cc;
            this.number = n;
        }
    }
}
