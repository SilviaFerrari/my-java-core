package com.SilviaFerrari.exercices.arrays;

public class CanBalance {
    public static int sumElements(int[] v, int start, int end){
        int res = 0;
        for(int i = start; i <= end; i++){
            res += v[i];
        }
        return res;
    }
    public static boolean canBalance(int[] v){
        if(v.length >= 2) {
            for (int i = 0; i < v.length - 1; i++) {
                if (sumElements(v, 0, i) == sumElements(v, i + 1, v.length - 1)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] v = {1,1,1,1,2};
        if(canBalance(v)){
            System.out.println("E' possibile trovare un modo.");
        }
        else{
            System.out.println("Non e' possibile trovare un modo.");
        }
    }
}
