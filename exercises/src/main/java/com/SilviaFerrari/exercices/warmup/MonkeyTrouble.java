package com.SilviaFerrari.exercices.warmup;

import java.util.Scanner;
public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are the monkeys smiling? true/false");
        boolean aSmile = scanner.nextBoolean();
        boolean bSmile = scanner.nextBoolean();

        if(aSmile && bSmile || !aSmile && !bSmile){
            System.out.println("Run away!");
        }
        else{
            System.out.println("I hate monkeys.");
        }
    }
}
