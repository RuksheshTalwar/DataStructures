package main.java.dev.ruksheshtalwar.basicmaths.interviewquestions;

import java.util.ArrayList;
import java.util.List;

/**
 * INTERVIEW QUESTION
 * Given a number n. Identify 2 numbers such that a + b = n and neither 'a' nor 'b' should have 0 in them.
 * Like a + b = n if n is 17 then a should not be 10. a could be 9 and b could be 8
 */
public class IdentifyingSummationOfNumber {

    public static void main(String[] args) {
        List<int[]> listOfResultsArr = new ArrayList<>();
        int n = 19;
        for(int a = 1; a < n; a++) {
            int b = n - a;
            if((b % 10 != 0) && (a % 10 != 0)) {
                listOfResultsArr.add(new int[]{a,b});
            }
        }
        for(int[] pair:listOfResultsArr){
            for(int i = 0; i < pair.length; i++){
                System.out.print(pair[i] + " ");
            }

        }
    }

}
