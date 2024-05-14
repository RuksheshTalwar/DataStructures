package dev.ruksheshtalwar.queues;

public class QueueImplementation {
    public static void main(String[] args) {
        System.out.println("--------------------Simple Implementation------------------");
        Queue q1 = new Queue(5);
        q1.enque(1);
        q1.enque(2);
        q1.enque(3);
        q1.enque(4);
        System.out.println(q1.isFull());
        q1.deque();
        q1.deque();
        System.out.println(q1.isEmpty());
        System.out.println("--------------------Efficient Implementation------------------");


    }
}

class Queue {
    int size, capacity;
    int[] arr;

    Queue(int capacity) {
        this.capacity = capacity;
        size = 0;
        arr = new int[capacity];
    }

    protected boolean isFull() {
        return (size == capacity);
    }

    protected boolean isEmpty() {
        return (size == 0);
    }

    protected void enque(int x) {
        if (isFull()) return;

        arr[size] = x;
        size+=1;
    }

    protected void deque() {
        if(isEmpty()) return;
        for (int i = 0; i< arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        size -= 1;
    }
}

class Queue_Efficient {
    int capacity, front, size;
    int[] arr;

    Queue_Efficient(int capacity) {
        size = 0;
        front = 0;
        this.capacity = capacity;
        arr = new int[capacity];
    }

    boolean isFull() {
        return (size == capacity);
    }

    boolean isEmpty() {
        return (size == 0);
    }

    int getFront() {
        if (isEmpty())
            return -1;
        else
            return front;
    }

    int getRear() {
        if (isEmpty()) return -1;
        else return (front + size - 1) % capacity;
    }
    void enque(int x) {
        if (isFull()) return;
        int rear = getRear();
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size += 1;
    }

    void deque() {
        if (isEmpty()) return;
        front = (front + 1) % capacity;
        size =+1;
    }
}

class QueueImpl_UsingLinkedList {
    int capacity, size;

    QueueImpl_UsingLinkedList() {

    }
}
