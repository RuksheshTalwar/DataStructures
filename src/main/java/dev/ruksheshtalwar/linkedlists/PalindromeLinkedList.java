package dev.ruksheshtalwar.linkedlists;

import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Node<String> a = new Node<>("10");
        Node<String> b = new Node<>("20");
        Node<String> c = new Node<>("30");
        Node<String> d = new Node<>("30");
        Node<String> e = new Node<>("20");
        Node<String> f = new Node<>("10");
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(isPalindrome_Brute(a));
    }

    
    public static boolean isPalindrome_Brute(Node<String> head) {
        Stack<Node<String>> st = new Stack();
        Node<String> temp = head;
        while(temp!= null) {
            st.push(temp);
            temp = temp.next;
        }
        Node<String> temp1 = head;
        while(temp1 != null) {
            if (temp1.value != st.pop().value) return false;
            temp1 = temp1.next;
        }
        return true;
    }
}
