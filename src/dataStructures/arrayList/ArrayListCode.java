package dataStructures.arrayList;

import java.util.*;

public class ArrayListCode {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("25", "30"));
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("12", "9"));
        arrayList.add("10");
        arrayList.add("15");
        arrayList.add(0, "40");
        System.out.println("40 found at index: " + searchingArrayList(arrayList));
        traverseArrayListUsingIterator(arrayList);
        traverseArrayList(arrayList);
        System.out.println(arrayList.get(0));
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList);
        System.out.println("new array is: " + arrayList);

        // Collections.sort(arrayList);

    }

    public static String searchingArrayList(ArrayList<String> arrayList) {
        int index = arrayList.indexOf("40");
        // boolean exists = arrayList.contains("20");  // checks if 20 is in the list
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

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int n = a.size();
        d = d % n;
        reverseList(a, d, n - 1);
        reverseList(a, 0, d - 1);
        reverseList(a, 0, n - 1);
        return a;
    }

    public static void reverseList(List<Integer>arr, int left, int right) {
        while (left < right) {
            Collections.swap(arr, left, right);
            left++;
            right--;
        }
    }
}
