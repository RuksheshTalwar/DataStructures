package dev.ruksheshtalwar.basics;

public class SumOfNaturalNos {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNos(4));
        System.out.println(sumOfNaturalNos(1000000000));

    }

    private static int sumOfNaturalNos(int i) {
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            sum = sum + j;
        }
        return sum;
    }
}
