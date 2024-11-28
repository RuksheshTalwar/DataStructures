package main.java.dev.ruksheshtalwar.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrixArr = {{1, 2, 3, 4, 5}
                , {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}};
        printSpiral(matrixArr);


    }

    private static List<Integer> printSpiral(int[][] matrixArr) {
        List<Integer> ans = new ArrayList<>();
        int rows = matrixArr.length; // number of rows
        int cols = matrixArr[0].length; // number of columns
        int left = 0, right = cols - 1, top = 0, bottom = rows - 1;

        //right direction
        for (int i = left; i <= right; i++) {
            ans.set(matrixArr[top][i], i);
        }
        top++;
        //bottom direction
        for (int i = top; i <=bottom; i++) {
            ans.set(matrixArr[i][right], i);
        }
        right--;
        //left direction
        for (int i = right; i >= left; i--) {

        }



        return ans;
    }
}
