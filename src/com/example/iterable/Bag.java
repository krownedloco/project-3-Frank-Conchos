package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Bag<T> implements Container<T> {

    private final List<T> myList = new ArrayList<>();


    @Override
    public boolean isEmpty() {

        return myList.isEmpty();
    }

    @Override
    public int size() {

        return myList.size();
    }

    @Override
    public void add(T item) {

        myList.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return myList.iterator();
    }
}
