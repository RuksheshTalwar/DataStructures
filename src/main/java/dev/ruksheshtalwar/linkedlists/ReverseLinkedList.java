package dev.ruksheshtalwar.linkedlists;

import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(1);
        Node<Integer> b = new Node<>(2);
        Node<Integer> c = new Node<>(3);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(5);
        Node<Integer> f = new Node<>(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        bruteForce(a);
    }

    /**
     * It's a 2-pass or 2-step algorithm
     * Time complexity -> O (2N)
     * Space Complexity -> O (N)
     */

    private static void bruteForce(Node<Integer> head) {
        Stack<Integer> stack = new Stack<>();
        Node<Integer> temp = head;

        //Step 1 -> Put the Linked List data into Stack
        while (temp != null) {
            stack.push(temp.value);
            temp = temp.next;
        }

        //Step 2 -> Taking back from Stack and putting the data into Linked List
        temp = head;
        while (temp != null) {
            temp.value = stack.pop();
            temp = temp.next;
        }

        //Print the Linked List
        temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
}