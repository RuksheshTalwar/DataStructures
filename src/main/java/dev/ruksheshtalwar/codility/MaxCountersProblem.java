package main.java.dev.ruksheshtalwar.codility;

import java.util.Arrays;

public class MaxCountersProblem {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(naive_solution(5, new int[]{3, 4, 4, 6, 6, 1, 4, 4})));
    }

    public static int[] naive_solution(int N, int[] arr) {
        int[] resultsArr = new int[N];
//        Arrays.fill(resultsArr, 0);
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= N) {
                resultsArr[arr[i] - 1]++;
                max = Math.max(max, resultsArr[arr[i] - 1]);
            } else {
                for (int j = 0; j< resultsArr.length; j++) {
                    resultsArr[j] = max;
                }
            }
        }
        return resultsArr;
    }

    public static int[] better_solution(int N, int[] arr) {
        int[] resultsArr = new int[N];
        int counter_pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > N)
                counter_pos = i;
        }


        return resultsArr;
    }
}
