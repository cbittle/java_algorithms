package com.thecodespot.app.java.my.algorithms.sets.ordered;

public class BinarySearch<T extends Comparable<T>> extends Search<T> {
    public BinarySearch(final T[] numbers) {
        super(numbers);
    }

    @Override
    public boolean contains(final Comparable<T> target) {
        int lowerBound = 0;
        int upperBound = data.length - 1;

        while (lowerBound <= upperBound) {
            int middleIndex = (lowerBound + upperBound) / 2;
            T middleValue = data[middleIndex];
            if (target.compareTo(middleValue) < 0) {
                upperBound = middleIndex - 1;
            } else if (target.compareTo(middleValue) > 0) {
                lowerBound = middleIndex + 1;
            } else if (target.compareTo(middleValue) == 0) {
                return true;
            }
        }

        return false;
    }
}
