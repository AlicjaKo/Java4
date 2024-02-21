package myapp;

public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }
}


/*
 * 
 * 
3. Create an interface named `AgeFilter` with a single method 
named `accept`. The `accept` method should take a `Person` 
object as an argument and return a `boolean`.


4. Create a new class named `App` with a static `main` method that demonstrates how anonymous inner classes can be used to implement the `AgeFilter` interface.
 */