package com.thecodespot.app.java.my.algorithms.sets.ordered;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BinarySearchTest {
    @Test
    public void testContainsTrue() {
        final Integer[] numbers = {1, 2, 3, 4, 5};
        final int num = 2;
        final BinarySearch<Integer> ls = new BinarySearch<>(numbers);
        final boolean result = ls.contains(num);
        assertTrue("contains() returned False when it should have been True", result);
    }

    @Test
    public void testContainsFalse() {
        final Integer[] numbers = {1, 2, 3, 4, 5};
        final int num = 7;
        final BinarySearch<Integer> ls = new BinarySearch<>(numbers);
        final boolean result = ls.contains(num);
        assertFalse("contains() returned True when it should have been False", result);
    }
}