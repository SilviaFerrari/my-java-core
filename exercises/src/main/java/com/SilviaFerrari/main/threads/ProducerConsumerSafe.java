package com.SilviaFerrari.main.threads;

import javax.swing.*;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Consumer;

public class ProducerConsumerSafe {

    static class ProducerSafe extends Thread {
        final Deque<Integer> integerDeque;

        ProducerSafe(Deque<Integer> integerDeque) {
            super();
            this.integerDeque = integerDeque;
        }

        @Override
        public void run() {
            int i = 0;
            while(!interrupted()) {
                synchronized (integerDeque) {
                    integerDeque.addFirst(i++);
                }
            }
        }
    }

    static class ConsumerSafe extends Thread {
        final Deque<Integer> integerDeque;

        ConsumerSafe(Deque<Integer> integerDeque) {
            super();
            this.integerDeque = integerDeque;
        }

        public void run(){
            int lastElement = 0;
            while(!interrupted()) {
                try{
                    synchronized (integerDeque) {
                        lastElement = integerDeque.removeLast();
                    }
                } catch (NoSuchElementException e){
                    Thread.yield();
                }
                System.out.printf("Total number of consumed elements: %d\n", lastElement);
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Deque deque = new LinkedList<Integer>();
        ProducerSafe producer = new ProducerSafe(deque);
        ConsumerSafe consumer = new ConsumerSafe(deque);

        producer.start();
        consumer.start();

        Thread.sleep(100);

        producer.interrupt();
        consumer.interrupt();

        producer.join();
        consumer.join();
    }
}
