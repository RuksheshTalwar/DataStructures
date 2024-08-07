package main.java.dev.ruksheshtalwar.basicmaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {
    public static void main(String[] args) {
        printAllDivisors_timeComplexityOn(36);
        printAllDivisors_timeComplexityOsqrtN(36);
    }

    private static void printAllDivisors_timeComplexityOn(int n) {
        for (int i = 0; i<= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void printAllDivisors_timeComplexityOsqrtN(int n) {
        List<Integer> list = new ArrayList<>();
        //Time complexity of the loop -> O ((sqrt n))
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if ((n/i) != i) {
                    list.add(n/i);
                }
            }
        }
        //Time complexity of sorting -> O ((n log n)), n -> number of factors
        Collections.sort(list);
        //Time complexity of loop -> O ((n)), n -> number of factors
        for (Integer i: list) {
            System.out.print(i + " ");
        }
    }
}
