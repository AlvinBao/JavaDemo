package com.hulu.iterator;

public class IteratorMain {
    public static void main(String[] args) {
        Collection<Integer> collection = new CollectionImpl<>();
        for (int i = 0; i < 10; ++i) {
            collection.add((int) Math.exp(i));
        }


        Iterator it = collection.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
