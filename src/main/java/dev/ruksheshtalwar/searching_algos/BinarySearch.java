package main.java.dev.ruksheshtalwar.searching_algos;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,1,4,6,8,9,10,11,19,23,25,28};
        int n = arr.length;
        int target = 12;
        int low = 0; int high = n - 1;
        binarySearch_Iterative(arr, target, n);
        binarySearch_Recursion(arr, target, low, high);
//        lowerBound(arr, target, n);
    }

    private static int binarySearch_Recursion(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == target) return mid;
        else if (target > arr[mid]) return binarySearch_Recursion(arr, target, mid + 1, high);

        return binarySearch_Recursion(arr, target, low, mid - 1);
    }

    private static int binarySearch_Iterative(int[] arr, int target, int n) {
        int low = 0; int high = n - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid -1;
        }
        return -1;
    }

//    private static void lowerBound(int[] arr, int target, int n) {
//        int low = 0;
//        int high = n;
//        while (low < high) {
//            int mid = low
//            if (arr[])
//        }
//    }


}


