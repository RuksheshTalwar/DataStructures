package com.design_patterns.iterator_pattern.facebook_social_graph;

public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
