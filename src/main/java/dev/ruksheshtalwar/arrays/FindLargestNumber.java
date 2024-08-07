package main.java.dev.ruksheshtalwar.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindLargestNumber {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,2};
        System.out.println(findLargestElement_Optimal(arr));
        System.out.println(findSecondLargestElement_Better(arr));
    }

//    static int findLargestElement_Brute() {
//        //Sort the array
//
//
//    }

    static int findSecondLargestElement_Better(int[] arr) {
        //In case of positive integers in an array
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int i =0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        HashMap<String, Integer> hashMap = new LinkedHashMap<>();
        return secondLargest;
    }


    static int findLargestElement_Optimal(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
