package be.pxl.ja.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("Item 1");
        data.add("Item 2");
        data.add("Item 3");
        
        // Define a Consumer to process and modify elements
        Consumer<String> processItem = item -> {
            // Append " - Processed" to each item
            data.set(data.indexOf(item), item + " - Processed");
        };
        
        // Process and modify elements using the Consumer
        data.forEach(processItem);
        
        System.out.println("Processed Data: " + data);
    }
}
