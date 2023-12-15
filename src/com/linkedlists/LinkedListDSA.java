package com.linkedlists;

import java.util.ArrayList;
import java.util.List;

public class LinkedListDSA {
    public static void main(String[] args) {
        Node<String> a = new Node<>("10");
        Node<String> b = new Node<>("20");
        Node<String> c = new Node<>("30");

        System.out.println(a.value);
        a.next = b;
        b.next = c;

        printListIteratively(a);
        printListRecursively(a);
        linkedListValues(a);
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
}
