package com.thecodespot.app.java.my;

import com.thecodespot.app.java.my.algorithms.sets.ordered.BinarySearch;
import com.thecodespot.app.java.my.algorithms.sets.ordered.LinearSearch;
import com.thecodespot.app.java.my.utilities.TimedAction;
import com.thecodespot.app.java.my.utilities.TimedCode;

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
        final TimedCode linearSearchTimedCode = () -> linearSearch.contains((int) (Math.random() * 1000) + 1);
        runningAvg = TimedAction.totalTime(linearSearchTimedCode, TIMES_TO_RUN);
        System.out.println("Linear Time Taken: " + Double.toString(runningAvg));

        TimedCode binarySearchTimedCode = () -> binarySearch.contains((int) (Math.random() * 1000) + 1);
        runningAvg = TimedAction.totalTime(binarySearchTimedCode, TIMES_TO_RUN);
        System.out.println("Binary Time Taken: " + Double.toString(runningAvg));
    }
}
