package com.SilviaFerrari.exercices.arrays;

public class IsEveryWhere {
    public static boolean isEveryWhere(int[] v, int value){
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] != value && v[i + 1] != value) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int val = 1;
        int[] v = {1,2,1,4,1,3};
        if(isEveryWhere(v, 1)){
            System.out.println("Il valore e' ovunque.");
        }
        else{
            System.out.println("Il valore non e' ovunque.");
        }
    }
}