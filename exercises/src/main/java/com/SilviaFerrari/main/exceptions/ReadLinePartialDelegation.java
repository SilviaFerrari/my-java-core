package com.SilviaFerrari.main.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;

public class ReadLinePartialDelegation {
    public static String readLinePartialDelegation(String filename){
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            return br.readLine();
        } catch (IOException e){
            throw new UncheckedIOException(e);
        }
    }
}
