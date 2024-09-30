package com.SilviaFerrari.exercices.warmup;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class TheRightPrice {
    public static void main(String[] args) {
        RandomGenerator rgen = RandomGenerator.getDefault();
        Scanner scan = new Scanner(System.in);

        int price = rgen.nextInt(101);
        System.out.println("User 1, guess the right price:");
        int ans1 = scan.nextInt();
        System.out.println("User 2, guess the right price:");
        int ans2 = scan.nextInt();

        if(Math.abs(price - ans1) < Math.abs(price - ans2)){
            System.out.println("User 1, you won! The price was " + price);
        }
        else if(Math.abs(price - ans1) > Math.abs(price - ans2)){
            System.out.println("User 2, you won! The price was " + price);
        }
        else{
            System.out.println("You both win! The price was " + price);
        }
    }
}
