package com.SilviaFerrari.main.exceptions;

import java.io.IOException;
import java.util.random.RandomGenerator;

public class RetryWrite {
    private static final RandomGenerator RND = RandomGenerator.getDefault();

    public static void writeWithTries(int maxTries) {
        int counter = maxTries;
        while(true) {
            try{
                write("Hello World!");
                break;
            } catch (Exception e){
                counter++;
                if(counter == maxTries) {
                    throw new RuntimeException("write() failed after " + maxTries + " tries");
                }
            }
        }
    }

    public static void write(String message) throws IOException {
        if (RND.nextDouble() < 0.66) {
            throw new IOException("Unable to send: " + message);
        }
    }

    public static void main(String[] args) {
        try {
            writeWithTries(3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
