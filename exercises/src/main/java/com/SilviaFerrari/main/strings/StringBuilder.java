package com.SilviaFerrari.main.strings;

import java.time.Duration;

public class StringBuilder {
    public static String concatenateSlow(int iterations) {
        // + operator
        String s = "";
        for (int i = 0; i < iterations; i++) {
            s += 'a';
        }
        return s;
    }

    public static String concatenateFast(int iterations) {
        // StringBuilder
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append('a');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        concatenateSlow(10000);
        long end = System.nanoTime();
        System.out.println("Execution time Slow: " + Duration.ofNanos(end - start).toMillis() + "ms");

        start = System.nanoTime();
        concatenateFast(10000);
        end = System.nanoTime();
        System.out.println("Execution time Fast: " + Duration.ofNanos(end - start).toMillis() + "ms");
    }
}
