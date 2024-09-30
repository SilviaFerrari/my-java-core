package com.SilviaFerrari.exercices.arrays;

import java.util.Arrays;

public class TenRun {
    public static int[] tenRun(int[] v){
        int[] dest = new int[v.length];
        int multiple = 0;
        for(int i = 0; i < v.length; i++){
            if(v[i]%10 == 0){
                multiple = v[i];
                dest[i] = v[i];
            }
            else if(multiple != 0){
                dest[i] = multiple;
            }
            else{
                dest[i] = v[i];
            }
        }
        return dest;
    }
    public static void main(String[] args) {
        int[] v = {2,10,4,5,20,4,5};
        System.out.println("Il vettore risultante e': " + Arrays.toString(tenRun(v)));
    }
}
