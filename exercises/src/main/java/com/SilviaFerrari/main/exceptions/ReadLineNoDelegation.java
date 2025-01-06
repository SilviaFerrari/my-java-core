package com.SilviaFerrari.main.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineNoDelegation {
    public static String readLineNoDelegation(String filename){
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            return br.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
