package com.hulu.iterator;

/**
 *
 * Provide unified method to traverse through collection
 */
public interface Iterator<E> {
    boolean hasNext();

    E next();
}
