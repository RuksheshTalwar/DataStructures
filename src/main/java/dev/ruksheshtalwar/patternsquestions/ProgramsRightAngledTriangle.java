package main.java.dev.ruksheshtalwar.patternsquestions;

import java.util.Scanner;

public class ProgramsRightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Enter X");
        int x = sc.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1) {
                    System.out.print("0");
                } else {
                    System.out.print(i * x + " ");
                }
            }
            System.out.println();
        }
    }
}
