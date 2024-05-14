package dev.ruksheshtalwar.patternsquestions;

import java.util.Scanner;

public class AllPatternsQuestions {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        int number = myObj.nextInt();
//        System.out.println("Printing First Pattern ---------------------");
//        printFirstPattern(number);
//        System.out.println("Printing Second Pattern ---------------------");
//        printSecondPattern(number);
//        System.out.println("Printing Third Pattern ---------------------");
//        printThirdPattern(number);
//        System.out.println("Printing Fourth Pattern ---------------------");
//        printFourthPattern(number);
//        System.out.println("Printing Fifth Pattern ---------------------");
//        printFifthPattern(number);
//        System.out.println("Printing Sixth Pattern ---------------------");
//        printSixthPattern(number);
//        System.out.println("Printing Eighth Pattern ---------------------");
//        printEighthPattern(number);
//        System.out.println("Printing Ninth Pattern ---------------------");
//        printNinthPattern(number);
//        System.out.println("Printing 10th Pattern ---------------------");
//        printTenthPattern(number);
//        System.out.println("PriprintTwelfthPattern
        System.out.println("Printing 12th Pattern ---------------------");
        printTwelfthPattern(number);
    }

    private static void printTwelfthPattern(int number) {
        for (int i = 1; i <= number; i++) {
            //number
            for (int j = 0; j < i; j++) {


            }

            //spaces

            //number
            for (int j = i; j >=1; j--) {

            }
        }

    }

//    private static void printNinthPattern(int number) {
//
//    }

    /**
     * Pattern 11           1
     *                      01
     *                      101
     *                      0101
     *                      10101
     *
     */
    private static void printEleventhPattern(int number) {
        for (int i = 0; i < number ; i++) {
            int start = (i % 2 == 0) ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    /**
     *
     *    Pattern 10      *
     *                    **
     *                    ***
     *                    ****
     *                    *****
     *                    ****
     *                    ***
     *                    **
     *                    *
     *
     */
    private static void printTenthPattern(int number) {
        for (int i = 1; i<= 2 * number - 1; i++) {
            int stars = i;
            if (i > number) stars = 2 * number - i;

            for (int j = 0; j < stars; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printEighthPattern(int number) {
        for (int i = 0; i < number; i++) {
            //space
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2 * number - (2 * i + 1); j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void printSeventhPattern(int number) {
        for (int i = 0; i < number; i++) {
            //space
            for (int j = 0; j < number - i - 1; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < number - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void printSixthPattern(int n) {
        for(int i = 1; i <=n; i++) {
            for (int j = 1; j<= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printFifthPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // (n - row + 1) means when row is 1 then if n -> 6 then (6 - 1 + 1) = 6 so 6 stars will be printed
            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printFourthPattern(int n) {
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void printThirdPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printSecondPattern(int n) {
        for (int i = 0; i< n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printFirstPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
