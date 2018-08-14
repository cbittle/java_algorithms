package com.thecodespot.app.java.my.algorithms.sets.ordered;

public class LinearSearch<T extends Comparable<T>> extends Search<T> {
    public LinearSearch(T[] _data) {
        super(_data);
    }

    @Override
    public boolean contains(final Comparable<T> target) {
        for (T datum : data) {
            if (target.compareTo(datum) == 0) {
                return true;
            }
        }
        return false;
    }
}
