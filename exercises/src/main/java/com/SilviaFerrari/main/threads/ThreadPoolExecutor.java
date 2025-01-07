package com.SilviaFerrari.main.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

public class ThreadPoolExecutor {
    private final static int POOL_SIZE = 4;
    private final static int NUMBER_OF_TASKS = 10;

    public static void main(String[] args) {
        // chiamo un executor che può usare al massimo 4 thread
        ExecutorService executor = Executors.newFixedThreadPool(POOL_SIZE);
        RandomGenerator random = RandomGenerator.getDefault();

        for (int i = 0; i < NUMBER_OF_TASKS; i++) {
            int taskId = i;
            executor.submit(() -> {
                long start = System.nanoTime();
                System.out.printf("START thread=%s task=%d\n",
                        Thread.currentThread().getName(), taskId);
                try{
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException ignored) {}

                long stop = System.nanoTime();
                System.out.printf("STOP thread=%s task=%d t=%d ms\n",
                        Thread.currentThread().getName(), taskId,
                        TimeUnit.NANOSECONDS.toMillis(stop - start));
            });
        }
        executor.shutdown(); // aspetta finchè tutti i task sono eseguiti
    }
}
