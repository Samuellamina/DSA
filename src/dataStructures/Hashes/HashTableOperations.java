package dataStructures.Hashes;

import java.util.*;

public class HashTableOperations {
    public static void main(String[] args) {
        // creating an HashTable
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("apple", 1);
        int value = hashtable.get("apple");
        //System.out.println("getting: " + value);
        // check if key exist
        boolean exists = hashtable.containsKey("apple");
        //hashtable.remove("apple");

        for (Integer val : hashtable.values()) {
            System.out.println("Value: " + val);
        }

        // Traverse key-value pairs
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        Hashtable<String, Integer> hashTable = new Hashtable<>();

        // Check empty case
        if (hashTable.isEmpty()) {
            System.out.println("HashTable is empty");
        }
    }

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        Hashtable<Integer, Integer> sumMap = new Hashtable<>();
        List<Integer> indices = new ArrayList<>(2);

        for (int i = 0; i < arr.size(); i++) {
            int c = m - arr.get(i);
            if(sumMap.containsKey(c)) {
                indices.add(sumMap.get(c) + 1);
                indices.add(i + 1);
                return indices;
            }
            sumMap.put(arr.get(i), i);
        }
        return indices;

    }
}
