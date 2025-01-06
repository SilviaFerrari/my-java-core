package com.SilviaFerrari.main.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineCompleteDelegation {
    public static String readLineCompleteDelegation(String filename) throws IOException {
       try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
           return br.readLine();
       }
    }
}
