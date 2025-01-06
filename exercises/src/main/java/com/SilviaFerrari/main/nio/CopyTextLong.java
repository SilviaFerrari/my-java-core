package com.SilviaFerrari.main.nio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyTextLong {
    public static void copyTextLong(String src, String dst){
        try(BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(src));
            BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(dst)))
        {
            bufferedReader.lines().forEach(line -> {
                try {
                    bufferedWriter.write(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}