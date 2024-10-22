package dataStructures.Hashes;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        // Insert (Add element)
        hashSet.add("apple");
        // Access (Check if element exists)
        boolean exists = hashSet.contains("apple");
        // hashSet.remove("apple");

        // Traverse elements
        for (String element : hashSet) {
            System.out.println("Element: " + element);
        }
        // Using an Iterator
        Iterator<String> iterator = hashSet.iterator();
//        while (iterator.hasNext()) {
//            String element = iterator.next();
//            System.out.println("Element: " + element);
//        }

        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("apple")) {
                iterator.remove();  // Safe removal
            }
        }

        //handle emtyhashset
        if (hashSet.isEmpty()) {
            System.out.println("HashSet is empty");
        }
    }
}
