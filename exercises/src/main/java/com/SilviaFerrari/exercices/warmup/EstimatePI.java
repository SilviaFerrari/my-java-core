package com.SilviaFerrari.exercices.warmup;

import java.util.random.RandomGenerator;

public class EstimatePI {
    public static long insideCircle(long trials){
        final RandomGenerator RGEN = RandomGenerator.getDefault();
        double x, y;            //coordinate
        long counter = 0;       //contatore dei punti interni al cerchio

        for(int i = 0; i < trials; i++){
            x = RGEN.nextDouble();
            y = RGEN.nextDouble();
            if((Math.pow(x, 2) + Math.pow(y, 2)) < 1){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        long trials, inside;    //long si usa per numeri interi molto grandi, come le potenze
        double esteem, error;          //double lo usamo per numeri con tante cifre decimali

        for(int i = 3; i < 25; i++){
            trials = (long) Math.pow(2, i);
            inside = insideCircle(trials);
            esteem = (4.0 * inside)/(double) (trials);
            error = 100.0 * (esteem - Math.PI) / Math.PI;

            System.out.printf("trials = 2^%d \testimate = %.16f \terror = %.8fpc\n", i, esteem, error);
        }
    }
}
