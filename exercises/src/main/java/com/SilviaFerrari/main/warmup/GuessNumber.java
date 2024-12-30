package com.SilviaFerrari.main.warmup;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessNumber {
    public static void main(String[] args) {
        //creo l'oggetto rgen che sarà il mio generatore casuale di numeri
        RandomGenerator rgen = RandomGenerator.getDefault();

        //creo l'oggetto scanner che mi servirà per leggere da terminale
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int randnum = rgen.nextInt(4);
            System.out.println("Guess a number between 0 (included) and 3 (excluded):");
            int answer = scanner.nextInt();

            if(answer != randnum){
                System.out.println("Wrong! The correct number was " + randnum + " Try again");
            }
            else{
                System.out.println("Correct! The number was " + randnum + "You won!");
                break;
            }
        }
    }
}
