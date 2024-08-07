package com.design_patterns.iterator_pattern;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator {

    private List<Book> booksList;
    private int index = 0;

    public BookIterator(List<Book> booksList) {
        this.booksList = booksList;
    }

    public boolean hasNext() {
        return index < booksList.size();
    }

    public Object next() {
        if (this.hasNext()) {
            booksList.get(index++);
        }
        return null;
    }
}
