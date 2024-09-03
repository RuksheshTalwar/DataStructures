package dev.ruksheshtalwar.basics;

public class SwapWithoutExtraSpace {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        x = x + y; // x -> 15
        y = x - y; // y -> 10
        x = x - y; // x -> 5
        System.out.println("After swapping:"
                + " x = " + x + ", y = " + y);
    }
}
