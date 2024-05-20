package dev.ruksheshtalwar.tuples;

/**
 * A tuple is an ordered collection of elements that can be of different data types
 * Unlike arrays or lists, tuples can store a heterogeneous set of values. Elements within a tuple are typically accessed by their position
 * or index rather than a key, unlike dictionaries or maps.
 */
public class CustomTuple<A,B> {
    private A first;
    private B second;

    public CustomTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "CustomTuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
