package dev.ruksheshtalwar.arrays;

public class FindMinimumInArray {
    static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,5,6,0,3,10,8,9,2};
        int min = findMin(arr);
        System.out.println(min);
    }
}
