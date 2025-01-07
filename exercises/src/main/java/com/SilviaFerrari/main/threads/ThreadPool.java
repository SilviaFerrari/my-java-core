package com.SilviaFerrari.main.threads;

import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

public class ThreadPool extends Thread {
    public static final int TASKS = 10;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threadPool = new Thread[TASKS];
        RandomGenerator random = RandomGenerator.getDefault();

        for (int i = 0; i < TASKS; i++) {
            int taskNumber = i;
            threadPool[i] = new Thread(() -> {
                long start = System.nanoTime();
                System.out.printf("START thread=%s task=%d\n",
                        Thread.currentThread().getName(), taskNumber );

                try{
                    Thread.sleep(random.nextInt(1000));
                }catch (InterruptedException ignored){}

                long stop = System.nanoTime();
                System.out.printf("STOP thread=%s task=%d t=%d ms\n",
                        Thread.currentThread().getName(), taskNumber,
                        TimeUnit.NANOSECONDS.toMillis(stop-start));
            });
        }

        // starting all threads
        for (int i = 0; i < TASKS; i++) {
            threadPool[i].start();
        }

        // waiting for all threads
        for (int i = 0; i < TASKS; i++) {
            threadPool[i].join();
        }
    }
}
