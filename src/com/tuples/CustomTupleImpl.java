package com.tuples;

public class CustomTupleImpl {

    public static void main(String[] args) {
        CustomTuple<String, Integer> customTuple = new CustomTuple<>("Person1", 11);

        String firstPerson = customTuple.getFirst();
        Integer age = customTuple.getSecond();

        System.out.println("Original Tuple : " + customTuple);

        //Modify the Tuple elements
        customTuple.setFirst("Person2");
        customTuple.setSecond(12);

        System.out.println("Modified Tuple : " + customTuple);
    }
}
