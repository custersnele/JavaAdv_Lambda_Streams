package be.pxl.ja.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // Define a Consumer to print names
        Consumer<String> printName = name -> System.out.println("Name: " + name);
        
        // Iterate through the list and apply the Consumer using forEach
        names.forEach(printName);
    }
}
