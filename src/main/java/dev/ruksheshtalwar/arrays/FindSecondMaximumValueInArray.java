package main.java.dev.ruksheshtalwar.arrays;

public class FindSecondMaximumValueInArray {
    static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {30, 31, 32, 35, 40, 20, 21, 50, 29};
        int secondMax = findSecondMax(arr);
        System.out.println(secondMax);
    }
}
