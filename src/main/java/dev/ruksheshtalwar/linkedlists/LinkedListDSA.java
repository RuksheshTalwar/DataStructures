package main.java.dev.ruksheshtalwar.linkedlists;

import java.util.ArrayList;
import java.util.List;

public class LinkedListDSA {
    public static void main(String[] args) {
        Node<String> a = new Node<>("10");
        Node<String> b = new Node<>("20");
        Node<String> c = new Node<>("30");

//        System.out.println(a.value);
        a.next = b;
        b.next = c;

        System.out.println("-------------Before Insertion---------------");
        printListIteratively(a);
        printListRecursively(a);
        linkedListValues(a);
        insertAtEnd(a);
        System.out.println("-------------After Insertion---------------");
        printListIteratively(a);
        findFractionalNode(a, 3);

    }

    private static void findFractionalNode(Node<String> head, int k) {


        Node<String> slow= head;
        Node<String> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
        }





    }

    //Traversing each element of a LinkedList
    static void printListIteratively(Node head) {
        Node current = head;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    //Traversing the LinkedList Recursively
    static void printListRecursively(Node head) {
        if (head == null) {
            return;
        }

        System.out.println(head.value);
        printListRecursively(head.next);
    }

    static List<String> linkedListValues(Node<String> head) {
        List<String> listNodes = new ArrayList<>();
        if (head == null) {
            return listNodes;
        }

        Node<String> current = head;
        while (current != null) {
            listNodes.add(current.value);
            current = current.next;
        }
        return listNodes;
    }

    //Add a new node to the end of the Linked List
    static void insertAtEnd(Node<String> head) {
        Node<String> current = head;
        Node<String> newNode = new Node<>("40");
        while(current != null && current.next != null)
            current = current.next;
        current.next = newNode;
    }

    static void deleteFromLL(Node<String> head) {
        head = head.next;
    }

//    static Node<String> findFractionalNode(Node<String> head, int k) {
//        int noOfNodes = 0;
//        Node<String> current = head;
//
//        while(current != null) {
//            noOfNodes += 1;
//            current = current.next;
//        }
//        int indexOfNodeToFind = noOfNodes / k;
////        for (int i = 0; i<= indexOfNodeToFind; i++) {
////            if (i == indexOfNodeToFind) {
////
////            }
////
////        }
//
//
//
//    }

//    static Node<String> findFractionalNode(Node<String> head, int k) {
//
//
//    }
}
