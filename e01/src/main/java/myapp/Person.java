package main.java.myapp;

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
        System.out.println("Address: " + this.address.city + ", " + this.address.street + ", " + this.address.zip);
        System.out.println("Phone: " + this.phoneNumber.countryCode + " " + this.phoneNumber.number);
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

/*



4. In the Person class: 
    1. Add a private property `Address address`.
    2. Add a `setAddress` method with `String street, String city,
     String zip` parameters that will create an `Address` object 
     with the `Address` constructor and assign it to the person 
     address property
    3. Add a private property `PhoneNumber phoneNumber`.
    4. Add a `setPhoneNumber` method with `String countryCode, String number` parameters that will create an `PhoneNumber` object with the `PhoneNumber` constructor and assign it to the person  phoneNumber property.
 
 
 
5. Create a new class named `App` with a static `main` 
method that demonstrates how the `Person` class, `Address` 
inner class, and `PhoneNumber` inner class can be used by 
creating a `Person` object and calling the setAddress and 
setPhoneNumber methods with the correct arguments.


6. Modify the `Person` class to include a method named 
`display` that displays the person's name, address, and 
phone number. 


7. Modify the `Main` class to call the `dislpay` method and run the application.
    //Expected output
    Name: John Doe
    Address: Valtakatu 5, Tampere, 32500
    Phone: (358) 050 444 5555
    
    Name: Jane Doe
    Address: Koulukatu 7, Tampere, 32500
    Phone: (358) 044 123 4467
 
 
    */
