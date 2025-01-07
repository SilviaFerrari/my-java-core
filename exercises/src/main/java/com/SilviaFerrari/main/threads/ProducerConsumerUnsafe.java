package com.SilviaFerrari.main.threads;

import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ProducerConsumerUnsafe {
    static class ProducerUnsafe extends Thread {
       final Deque<Integer> deque;

       public ProducerUnsafe(Deque<Integer> deque) {
           super();
           this.deque = deque;
       }

       public void run() {
           int i = 0;
           while(!isInterrupted()) {
               deque.addFirst(i++);
           }
       }
    }

    static class ConsumerUnsafe extends Thread {
        final Deque<Integer> deque;

        public ConsumerUnsafe(Deque<Integer> deque) {
            super();
            this.deque = deque;
        }

        public void run() {
            int lastElement = 0;
            while(!isInterrupted()) {
                try{
                    lastElement = deque.removeLast();
                } catch (NoSuchElementException e) {
                    Thread.yield();
                }
            }
            System.out.printf("Total number of consumed elements: %d\n", lastElement);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> deque = new ConcurrentLinkedDeque<>();
        ProducerUnsafe producer = new ProducerUnsafe(deque);
        ConsumerUnsafe consumer = new ConsumerUnsafe(deque);

        producer.start();
        consumer.start();

        Thread.sleep(100);

        producer.interrupt();
        consumer.interrupt();

        producer.join();
        consumer.join();
    }
}
