package dev.ruksheshtalwar.arrays.circular;

public class CircularArrayImplementation {
    public static void main(String[] args) {
        char[] a = {'A', 'B', 'C', 'D', 'E', 'F'};
        int n = a.length;
        int index = 3;
        printCircularArray_Naive(a, n, index);
        printCircularArray_Efficient(a, n, index);
    }

    private static void printCircularArray_Efficient(char[] a, int n, int index) {
        for (int i = index; i < index + n; i++) {
            System.out.println(a[(i % n)]);
        }
    }

    static void printCircularArray_Naive(char[] a, int n, int index) {
        char[] b  = new char[2 * n];
        for (int i = 0; i < n; i++) {
            b[i] = b[n + i] = a[i];
        }
        for (int i = index; i < n + index; i++) {
            System.out.println(b[i] + " ");
        }
    }


}


