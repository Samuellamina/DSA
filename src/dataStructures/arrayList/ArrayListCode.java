package dataStructures.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListCode {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("25", "30"));
        arrayList.add("10");
        arrayList.add("15");
        arrayList.add(0, "40");
        System.out.println("40 found at index: " + searchingArrayList(arrayList));
        traverseArrayListUsingIterator(arrayList);
        traverseArrayList(arrayList);
        System.out.println(arrayList.get(0));
    }

    public static String searchingArrayList(ArrayList<String> arrayList) {
        int index = arrayList.indexOf("40");
        return String.valueOf(index);
    }

    public static ArrayList<String> traverseArrayListUsingIterator(ArrayList<String> arrayList) {
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("from iterator: " + element);
        }
        return arrayList;
    }

    public static ArrayList<String> traverseArrayList(ArrayList<String> arrayList) {
        for (String element: arrayList) {
            System.out.println(element);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i);
        }
        return arrayList;
    }
}
