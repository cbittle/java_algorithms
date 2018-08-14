package com.thecodespot.app.java.my.utilities;

public class TimedAction {
    public static double averageTime(TimedCode code, Integer timesToRun) {
        double runningAverage = 1;
        for (int i = 1; i < timesToRun + 1; i++) {
            long startTime = System.nanoTime();
            code.run();
            long stopTime = System.nanoTime();
            long timeTaken = stopTime - startTime;
            runningAverage = ((runningAverage * (i - 1)) / i) + (timeTaken / (double) i);
        }
        return runningAverage;
    }

    public static double totalTime(TimedCode code, Integer timesToRun) {
        double totalTimeTaken = 0.0;
        for (int i = 1; i < timesToRun + 1; i++) {
            long startTime = System.nanoTime();
            code.run();
            long stopTime = System.nanoTime();
            long timeTaken = stopTime - startTime;
            totalTimeTaken += timeTaken;
        }
        return totalTimeTaken;
    }
}

