package com.thecodespot.app.java.my.algorithms.sets.ordered;

public abstract class Search<T extends Comparable<T>> {
    final T[] data;

    Search(final T _data[]) {
        this.data = _data;
    }
    public abstract boolean contains(final Comparable<T> target);
}
