package main.java.dev.ruksheshtalwar.linkedlists;

public class MiddleOfLinkedList {
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
        Node<Integer> head = a;
        Node<Integer> middleNode_Brute = middleOfLinkedList_BruteForce(a);
        Node<Integer> middleNode_Optimal = middleOfLinkedList_OptimalSolution(a);
        System.out.println(middleNode_Brute.value);
        System.out.println(middleNode_Optimal.value);
    }

    private static Node<Integer> middleOfLinkedList_BruteForce(Node<Integer> head) {
        Node<Integer> temp = head;
        int countNoOfNodes = 0;

        //Step1 -> To calculate the number of nodes in a LL
        while(temp != null) {
            countNoOfNodes++;
            temp = temp.next;
        }
        //Step 2 ->
        Node<Integer> middleNode = new Node<>((countNoOfNodes/2) + 1);
        temp = head;
        while(temp != null) {
            middleNode.value = middleNode.value - 1;
            if (middleNode.value == 0) break;
            temp = temp.next;
        }
        return temp;
    }

    private static Node<Integer> middleOfLinkedList_OptimalSolution(Node<Integer> head) {
        Node<Integer> slow = head; Node<Integer> fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
