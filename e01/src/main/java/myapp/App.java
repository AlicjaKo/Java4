package main.java.myapp;

public class App {
    public static void main(String[] args) {
        Person person = new Person("John");
        person.setAddress("Falcon", "New york", "11");
        person.setPhoneNumber("+11", "899 99 909");
    
        person.display();
    
    }
}
