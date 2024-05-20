package dev.ruksheshtalwar.linkedlists;

import com.sun.jdi.connect.spi.TransportService;

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedListNode<Integer> head = null;
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);
    }

    static LinkedListNode<Integer> insertBegin(LinkedListNode<Integer> head, Integer x) {
        LinkedListNode<Integer> temp = new LinkedListNode<>(x);
        temp.next = head;
        return temp;
    }

//    static LinkedListNode<Integer> insertAtEnd(LinkedListNode<Integer> head, Integer x) {
//        LinkedListNode<Integer> temp = new LinkedListNode<>(x);
//        if (head == null) {
//            temp = head;
//        } else {
//            while(head.next != null) {
//                head.next=head;
//                if (head.next == null) {
//                    temp = head;
//                }
//            }
//        }
//
//    }
}

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    LinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }
}


