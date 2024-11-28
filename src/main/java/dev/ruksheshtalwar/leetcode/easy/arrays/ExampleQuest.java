package main.java.dev.ruksheshtalwar.leetcode.easy.arrays;

/**
 *
 * Null as an Argument: When null is passed as an argument, Java tries to determine which overloaded method to call.
 * Since null can be assigned to any reference type, the compiler has to decide which method to invoke based on the available overloads.
 *
 * Matching Methods: Here, there are two m1 methods:
 *
 * static void m1(Object s)
 * static void m1(Integer i)
 * The null can be passed to both methods because null can represent both an Object and an Integer.
 *
 * Then More Specific Method check is done: When there are multiple applicable methods, Java prefers the "more specific" method.
 * An Integer is more specific than Object because Integer is a subclass of Object.
 */
public class ExampleQuest {
    public static void main(String[] args) {
        m1(null);
    }

    static void m1(Object s) {
        System.out.println("hi");
    }
    static void m1(Integer i) {
        System.out.println("hello");
    }
}
