package com.hulu.iterator;

import java.util.ArrayList;
import java.util.List;

public class CollectionImpl<T> implements Collection<T> {
    private List<T> data = new ArrayList<>();

    @Override
    public void add(T i) {
        data.add(i);
    }

    @Override
    public void remove(T i) {
        data.remove(i);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iter();
    }

    private class Iter implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < data.size();
        }

        @Override
        public T next() {
            return data.get(index++);
        }
    }

}
