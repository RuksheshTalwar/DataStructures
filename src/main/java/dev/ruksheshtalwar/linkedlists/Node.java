package main.java.dev.ruksheshtalwar.linkedlists;

public class Node<T> {

    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}
