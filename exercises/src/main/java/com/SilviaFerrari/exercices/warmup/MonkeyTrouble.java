package com.SilviaFerrari.exercices.warmup;

import java.util.Scanner;
public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Are the monkeys smiling? true/false");
        boolean aSmile = scan.nextBoolean();
        boolean bSmile = scan.nextBoolean();

        if(aSmile && bSmile || !aSmile && !bSmile){
            System.out.println("Run away!");
        }
        else{
            System.out.println("I hate monkeys.");
        }
    }
}
