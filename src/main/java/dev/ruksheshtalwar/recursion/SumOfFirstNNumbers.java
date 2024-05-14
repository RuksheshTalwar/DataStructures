package dev.ruksheshtalwar.recursion;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int n = 3;
        meth(n, 0);
        int sumOfNaturalNumbers = functionalRecursion(n);
        System.out.println(sumOfNaturalNumbers);
        printSum_anotherMethod(1,5, 0);
    }

    static void meth(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        meth(i - 1, sum + i);
    }

    static int functionalRecursion(int n) {
        if (n == 0) return 0;

        return n + functionalRecursion(n - 1);
    }

    static void printSum_anotherMethod(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum_anotherMethod(i + 1, n, sum);
    }
}
