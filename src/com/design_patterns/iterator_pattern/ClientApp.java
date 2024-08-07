package com.design_patterns.iterator_pattern;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ClientApp {
    public static void main(String[] args) {
        List<Book> booksList = Arrays.asList(
                new Book(1000, "Science"),
                new Book(100, "Maths"),
                new Book(40, "Bio"),
                new Book(50, "GK")
        );
        Library lib = new Library(booksList);
        Iterator iterator = lib.createIterator();

        while(iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
        }
    }
}
