package dev.ruksheshtalwar.hashing;

import java.util.Scanner;

public class HashingForArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfArrayElements = sc.nextInt();
        int[] arr = new int[noOfArrayElements];
        for (int i = 0; i< noOfArrayElements; i++) {
            arr[i] = sc.nextInt();
        }
        //precompute or pre-storing
        int[] hashArray = new int[13];
//        int[] hashArray= new int[10000000];
        for (int i = 0; i < noOfArrayElements; i++) {
            hashArray[arr[i]] += 1;
        }
        int noOfElementsToBeFound = sc.nextInt();
        while(noOfElementsToBeFound-- != 0) {
            int number = sc.nextInt();
            //fetch
            System.out.println(hashArray[number]);
        }
    }
}
