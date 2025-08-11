package dev.ruksheshtalwar.linkedlists;

import java.util.HashMap;
import java.util.Map;

public class DetectALoopInLL {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(1);
        Node<Integer> b = new Node<>(2);
        Node<Integer> c = new Node<>(3);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(5);
        Node<Integer> f = new Node<>(6);
        Node<Integer> g = new Node<>(7);
        Node<Integer> h = new Node<>(8);
        Node<Integer> i = new Node<>(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = c;
        System.out.println(detectLoop_BruteForceSolution(a));
        System.out.println(detectLoop_OptimalSolution(a));
    }

    private static boolean detectLoop_OptimalSolution(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    private static boolean detectLoop_BruteForceSolution(Node<Integer> head) {
        Node<Integer> temp = head;
        Map<Node<Integer>, Integer> map = new HashMap<>();

        while (temp != null) {
            if (map.containsKey(temp))
                return true;
            map.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }
}
