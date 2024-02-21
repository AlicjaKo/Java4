
package myapp;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        AgeFilter filter = new AgeFilter() {
            public boolean accept(Person p) {
                return p.getAge()>=40;
            };
        };
    

        List<Person> people = new ArrayList<>();
        people.add(new Person(21));
        people.add(new Person(30));
        people.add(new Person(40));
        people.add(new Person(50));


    System.out.println("Filtered People:");
    for (Person person : people) {
        if (filter.accept(person)) {
            System.out.println(person.getAge());
        }
    }
    }
}
