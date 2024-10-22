package dataStructures.linkedlist;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        // SINGLY LINKED LIST
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//        singlyLinkedList.createSinglyLinkedList(5);
//        //System.out.println(singlyLinkedList.head.value);
//
        singlyLinkedList.insertInLinkedList(6, 1);
//        singlyLinkedList.insertInLinkedList(7, 3);
//        singlyLinkedList.insertInLinkedList(8, 4);
//        singlyLinkedList.insertInLinkedList(9, 0);
//
//        singlyLinkedList.traverseSinglyLinkedList();
//        singlyLinkedList.searchNode(7);
//
//        singlyLinkedList.deletionOfNode(3);
//        System.out.println(singlyLinkedList.searchNode(7));
//
//        singlyLinkedList.deleteSinglyLinkedList();


        // CIRCULAR SINGLY LINKED LIST

        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
        circularSinglyLinkedList.createCircularSinglyLinkedList(4);
        circularSinglyLinkedList.insertInCSLinkedList(3, 0);
        circularSinglyLinkedList.insertInCSLinkedList(5, 1);
        circularSinglyLinkedList.insertInCSLinkedList(6, 7);
//        System.out.println(circularSinglyLinkedList.head.value);
//        System.out.println(circularSinglyLinkedList.head.next.value);
        circularSinglyLinkedList.traverseCSSinglyLinkedList();
        circularSinglyLinkedList.searchCSLLNode(5);
        circularSinglyLinkedList.deletionOfNode(1);
        circularSinglyLinkedList.traverseCSSinglyLinkedList();
        circularSinglyLinkedList.deleteCircularSingleLinkedList();
        circularSinglyLinkedList.traverseCSSinglyLinkedList();

    }
}
