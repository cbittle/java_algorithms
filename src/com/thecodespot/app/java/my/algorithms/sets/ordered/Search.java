package com.thecodespot.app.java.my.algorithms.sets.ordered;

public abstract class Search {
    final int[] integers;

    Search(final int numbers[]) {
        this.integers = numbers;
    }
    public abstract boolean contains(final int num);
}
