package com.SilviaFerrari.main.arrays;

public class CanBalance {
    public static int sum(int[] v, int start, int end){
        int res = 0;
        for(int i = start; i <= end; i++){
            res += v[i];
        }
        return res;
    }

    public static boolean canBalance(int[] v){
        if(v.length >= 2) {
            for (int i = 0; i < v.length - 1; i++) {
                if (sum(v, 0, i) == sum(v, i + 1, v.length - 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
