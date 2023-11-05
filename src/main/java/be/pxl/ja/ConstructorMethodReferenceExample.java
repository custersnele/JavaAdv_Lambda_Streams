package be.pxl.ja;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorMethodReferenceExample {
    public static void main(String[] args) {
        // Using a constructor method reference to create a new Person object
        Supplier<Person> personSupplier = Person::new;
        Person person = personSupplier.get();
        System.out.println("Name: " + person.getName()); // Outputs: Name: Unknown
   
        // Using a constructor method reference to create a new Person object with a name
        Function<String, Person> personFunction = Person::new;
        Person person2 = personFunction.apply("Alice");

        System.out.println("Name: " + person2.getName()); // Outputs: Name: Alice
    }
}
