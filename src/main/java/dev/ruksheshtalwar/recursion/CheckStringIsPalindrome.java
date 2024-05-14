package dev.ruksheshtalwar.recursion;

/**
 * Time Complexity -> O (n/2)
 * Space Complexity -> Auxillary stack space -> O (n/2)
 */
public class CheckStringIsPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        int n = str.length();
        System.out.println(recursiveWay(0, str, n));
    }

    private static boolean recursiveWay(int i, String str, int n) {
        if (i >= n/2) return true;
        if (str.charAt(i) != str.charAt(n - i - 1)) return false;
        return recursiveWay(i + 1, str, n);
    }
}
