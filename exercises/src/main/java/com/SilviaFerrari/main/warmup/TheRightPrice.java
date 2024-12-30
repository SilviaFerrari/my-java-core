package com.SilviaFerrari.main.warmup;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class TheRightPrice {
    public static void main(String[] args) {
        RandomGenerator random = RandomGenerator.getDefault();
        Scanner scanner = new Scanner(System.in);

        int price = random.nextInt(101);
        System.out.println("User 1, guess the right price:");
        int ans1 = scanner.nextInt();
        System.out.println("User 2, guess the right price:");
        int ans2 = scanner.nextInt();

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
