package com.thecodespot.app.java.my;

import com.thecodespot.app.java.my.algorithms.sets.ordered.BinarySearch;
import com.thecodespot.app.java.my.algorithms.sets.ordered.LinearSearch;
import com.thecodespot.app.java.my.algorithms.sets.ordered.Search;

import java.util.Random;

public class Main {
    private static final int TIMES_TO_RUN = 10000;
    private static final int SIZE_OF_RANDOM_INTS = 100000;

    public static void main(String[] args) {
        final Integer[] intSet1 = (new Random().ints(SIZE_OF_RANDOM_INTS, 1, 100000)).boxed().toArray(Integer[]::new);
        final Integer[] intSet2 = (new Random().ints(SIZE_OF_RANDOM_INTS, 1, 100000)).boxed().toArray(Integer[]::new);

        final LinearSearch<Integer> linearSearch = new LinearSearch<>(intSet1);
        final BinarySearch<Integer> binarySearch = new BinarySearch<>(intSet2);

        double runningAvg;
        runningAvg = timeSearches(linearSearch);
        System.out.println("Linear Average: " + Double.toString(runningAvg));

        runningAvg = timeSearches(binarySearch);
        System.out.println("Binary Average: " + Double.toString(runningAvg));
    }

    private static int getRandomInteger() {
        return (int)(Math.random() * 1000) + 1;
    }

    private static double timeSearches(final Search<Integer> searchObj) {
        double runningAverage = 1;
        for (int i = 1; i < TIMES_TO_RUN + 1; i++) {
            long startTime = System.nanoTime();
            if (searchObj.contains(getRandomInteger())){
                i -= 1;
                continue;
            }
            long stopTime = System.nanoTime();
            long timeTaken = stopTime - startTime;
            runningAverage = ((runningAverage * (i - 1)) / i) + (timeTaken / (double) i);
        }
        return runningAverage;
    }
}
