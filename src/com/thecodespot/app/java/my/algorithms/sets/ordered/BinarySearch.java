package com.thecodespot.app.java.my.algorithms.sets.ordered;

public class BinarySearch extends Search {
    public BinarySearch(final int[] numbers) {
        super(numbers);
    }

    @Override
    public boolean contains(final int valueToBeFound) {
        int lowerBound = 0;
        int upperBound = integers.length - 1;

        while (lowerBound <= upperBound) {
            int middleIndex = (lowerBound + upperBound) / 2;
            int middleValue = integers[middleIndex];
            if (valueToBeFound < middleValue) {
                upperBound = middleIndex - 1;
            } else if (valueToBeFound > middleValue) {
                lowerBound = middleIndex + 1;
            } else if (valueToBeFound == middleValue) {
                return true;
            }
        }

        return false;
    }
}
