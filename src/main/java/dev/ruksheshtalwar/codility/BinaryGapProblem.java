package dev.ruksheshtalwar.codility;

public class BinaryGapProblem {
    public static void main(String[] args) {
        Integer N = 9;
        solution(N);
    }

    public static int solution(int N) {
        String binaryString = Integer.toString(N, 2);

        boolean start_counting = false;
        int current_gap = 0;
        int max_gap = 0;

        for (int i = 0; i< binaryString.length(); i++) {
            String c = binaryString.substring(i, i + 1);
            if (c.equals("1")) {
                if (start_counting && current_gap > max_gap) {
                    max_gap = current_gap;
                    }
                current_gap = 0;
                start_counting = true;
            }
            if (c.equals("0")) current_gap++;
        }
        return max_gap;
    }
}
