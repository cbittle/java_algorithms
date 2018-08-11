package com.thecodespot.app.java.my.algorithms.sets.ordered;

public class LinearSearch extends Search {
    public LinearSearch(int[] numbers) {
        super(numbers);
    }

    @Override
    public boolean contains(final int num) {
        for (int integer : integers) {
            if (integer == num) {
                return true;
            }
        }
        return false;
    }
}
