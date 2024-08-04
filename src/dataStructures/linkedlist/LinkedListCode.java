package dataStructures.linkedlist;

public class LinkedListCode {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createSinglyLinkedList(5);
        //System.out.println(singlyLinkedList.head.value);

        singlyLinkedList.insertInLinkedList(6, 1);
        singlyLinkedList.insertInLinkedList(7, 3);
        singlyLinkedList.insertInLinkedList(8, 4);
        singlyLinkedList.insertInLinkedList(9, 0);// insert at beginning
        //System.out.println(singlyLinkedList.head.value);

        singlyLinkedList.traverseSinglyLinkedList();
        singlyLinkedList.searchNode(7);
    }
}
