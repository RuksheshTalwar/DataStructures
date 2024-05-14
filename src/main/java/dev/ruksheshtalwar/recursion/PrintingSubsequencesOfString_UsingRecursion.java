package dev.ruksheshtalwar.recursion;


import java.util.ArrayList;
import java.util.List;

public class PrintingSubsequencesOfString_UsingRecursion {
    public static void main(String[] args) {
        String str = "312";
        int[] arr = {1,2,1};
//        printSubsequences_AnotherMethod(arr, new ArrayList<>());

        String subsequencesStr = "";
//        printSubsequences(0, str, subsequencesStr);
//        printSubsequencesWhereSumEqualsToK(0, arr, 0, 2, new ArrayList<>());
        printSubsequencesWhereSumEqualsToK(0, arr, 0, 2, new ArrayList<>());
        printOneSubsequenceWhereSumEqualsToK(0, arr, 0, 2, new ArrayList<>());
    }

    private static boolean printOneSubsequenceWhereSumEqualsToK(int index, int[] arr, int sum, int k, List<Integer> ds) {
        if (index == arr.length) {
            if (sum == k) {
                System.out.println(ds);
                return true;
            }
            else return false;
        }
        List<Integer> subsequenceWithCurrentIndex = new ArrayList<>(ds);
        subsequenceWithCurrentIndex.add(arr[index]);
        sum += arr[index];
        if (printOneSubsequenceWhereSumEqualsToK(index + 1, arr, sum, k, subsequenceWithCurrentIndex) == true) {
            return true;
        }
        sum -= arr[index];
        if (printOneSubsequenceWhereSumEqualsToK(index + 1, arr, sum, k, ds) == true) {
            return true;
        }
        return false;
    }

//    private static void printSubsequences(int i, String str, String subsequencesStr) {
//        int n = str.length();
//        if (i == n) {
//            System.out.println(subsequencesStr);
//            return;
//        }
//        printSubsequences(i + 1, str, subsequencesStr + str.charAt(i));
//        printSubsequences(i + 1, str, subsequencesStr);
//    }

//    private static void printSubsequencesWhereSumEqualsToK(int ind, int[] arr, int sum, int k, List<Integer> ds) {
//        if (ind == arr.length) {
//            if (sum == k) {
//                System.out.println(ds);
//                return;
//            }
//        }
//        List<Integer> subsequenceWithCurrent = new ArrayList<>();
//        subsequenceWithCurrent.add(arr[ind]);
//        sum += arr[ind];
//
//        printSubsequencesWhereSumEqualsToK(ind + 1, arr, sum, k, subsequenceWithCurrent);
//        sum -= arr[ind];
//        printSubsequencesWhereSumEqualsToK(ind + 1, arr, sum, k, ds);
//    }


    public static void printSubsequencesWhereSumEqualsToK(int index, int[] arr, int sum, int k, List<Integer> subsequence) {
        // Base case: when index reaches the length of the array
        if (index == arr.length) {
            if (sum == k) {
                System.out.println(subsequence);
            }
            return;
        }
        // Include the current element in the subsequence and recurse
        List<Integer> subsequenceWithCurrent = new ArrayList<>(subsequence);
        subsequenceWithCurrent.add(arr[index]);
        sum += arr[index];
        printSubsequencesWhereSumEqualsToK(index + 1, arr, sum, 2, subsequenceWithCurrent);

        // Exclude the current element from the subsequence and recurse
        sum -= arr[index];
        printSubsequencesWhereSumEqualsToK(index + 1, arr, sum, 2, subsequence);
    }
}
