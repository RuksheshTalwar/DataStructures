package main.java.dev.ruksheshtalwar.mathematics;

public class CountOfDigits {

    public static void main(String[] args) {
        System.out.println("Count of digits in this number : " + findCountOfDigits(5678));
        System.out.println("Count of digits in this number : " + findCountOfDigits(567878));
    }

    private static int findCountOfDigits(int i) {
        int res = 0;

        while (i > 0) {
            i = i / 10;
            res++;
        }
        return res;
    }
}
