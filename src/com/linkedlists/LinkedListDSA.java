package com.linkedlists;

public class LinkedListDSA {
    public static void main(String[] args) {
        Node<String> a = new Node<>("10");
        Node<String> b = new Node<>("20");
        Node<String> c = new Node<>("30");

        System.out.println(a.value);
        a.next = b;
        b.next = c;

    }
}
