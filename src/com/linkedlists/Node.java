package com.linkedlists;

public class Node<T> {

    T value;
    Node next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}
