package com.SilviaFerrari.main.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n){
        Set<Integer> primes = new HashSet<>();
        for(int i = 2; i <= n; i++){
            primes.add(i);
        }

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            primes.removeAll(multiplesOf(i, n));
        }
        return primes;
    }

    public static Set<Integer> multiplesOf(int i, int n){
        Set<Integer> multiples = new HashSet<>();
        for(int j = 2; i*j <= n; j++){
            multiples.add(i*j);
        }
        return multiples;
    }
}
